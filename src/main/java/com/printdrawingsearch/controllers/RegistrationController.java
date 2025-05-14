package com.printdrawingsearch.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.printdrawingsearch.dto.MyUserDto;
import com.printdrawingsearch.repository.MyUserRepository;
import com.printdrawingsearch.service.UserPrintService;

/**
 * Controller for user registration.
 */
@RequestMapping(value = "/api")
@RestController
public class RegistrationController {
	Logger logger = LoggerFactory.getLogger(RegistrationController.class.getName());

	/** The my user repository. */
	@Autowired
	private MyUserRepository myUserRepository; // Repository for managing user data

	/** The password encoder. */
	@Autowired
	private PasswordEncoder passwordEncoder; // Encoder for password hashing

	@Autowired
	private UserPrintService userPrintService;

	/**
	 * Endpoint for user registration.
	 *
	 * @param user the user details
	 * @return a response indicating the result of the registration
	 */
	@PostMapping("/register/user")
	@CrossOrigin(origins = "https://printsearch-frontend-production.up.railway.app")
	public ResponseEntity<String> createUser(@RequestBody MyUserDto myUserDto) {

		logger.trace("Entered......createUser() ");
		System.out.println("Entered......createUser() ");

		// Check if the username already exists
		if (myUserRepository.findByUsername(myUserDto.getUsername()).isPresent()) {

			logger.trace("Exited......createUser() ");
			System.out.println("Exited......createUser() ");

			// Return conflict response if username already exists
			return new ResponseEntity<>("User already exists. Try another username.", HttpStatus.CONFLICT);
		}
		System.out.println("myUserDto.getRole() ================= " + myUserDto.getRole());
		if (myUserDto.getRole().isEmpty()) {
			myUserDto.setRole("USER");

		}

		if (myUserDto.getRole() == null) {
			myUserDto.setRole("USER");

		}

		System.out.println("myUserDto.getRole() = " + myUserDto.getRole());

		if (myUserDto.getRole().equals("ADMIN")) {
			myUserDto.setRole("ADMIN,USER");

		}

		userPrintService.createUser(myUserDto);

		// // Encode user password before saving
		// myUserDto.setPassword(passwordEncoder.encode(myUserDtoNew.getPassword()));
		// // Save user details to the repository
		// myUserRepository.save(myUserDto);

		logger.trace("Exited......createUser() ");
		// Return success response upon successful registration
		return new ResponseEntity<>("Registration is successful :)", HttpStatus.OK);
	}
}
