
package com.printdrawingsearch.healthcheck;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MemoryHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();

		long freeMemory = memoryUsage.getMax() - memoryUsage.getUsed();
		long totalMemory = memoryUsage.getMax();
		double freeMemoryPercent = (double) freeMemory / totalMemory * 100;

		if (freeMemoryPercent < 10) { // Example threshold: Consider unhealthy if less than 10% free
			return Health.down().withDetail("free_memory", freeMemory + " bytes")
					.withDetail("total_memory", totalMemory + " bytes")
					.withDetail("free_memory_percent", freeMemoryPercent + "%").build();
		} else {
			return Health.up().withDetail("free_memory", freeMemory + " bytes")
					.withDetail("total_memory", totalMemory + " bytes")
					.withDetail("free_memory_percent", freeMemoryPercent + "%").build();
		}
	}
}
