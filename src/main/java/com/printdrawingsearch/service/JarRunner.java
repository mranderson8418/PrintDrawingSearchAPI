import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JarRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", "your-other-jar.jar");
			Process process = processBuilder.start();
			process.waitFor(); // Wait for the process to finish
			System.out.println("Other JAR execution completed.");

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}