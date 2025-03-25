package com.printdrawingsearch.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.printdrawingsearch.dto.MyUserDto;
import com.printdrawingsearch.model.MyUser;
import com.printdrawingsearch.repository.MyUserRepository;
import com.printdrawingsearch.service.UserPrintService;

@Service
public class UserPrintServiceImpl implements UserPrintService {

	Logger logger = LoggerFactory.getLogger(UserPrintServiceImpl.class.getName());

	@Autowired
	MyUserRepository myUserRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void createUser(MyUserDto myUserDto) {

		// MyUser tempUser = convertMyUserDtoToMyUser(myUserDto);

		MyUser newUser = new MyUser();

		newUser.setPassword(passwordEncoder.encode(myUserDto.getPassword()));

		newUser.setUsername(myUserDto.getUsername());

		newUser.setRole(myUserDto.getRole());

		myUserRepository.save(newUser);

		logger.trace("EXITED……………………………………registerNewUser()");

		MyUserDto newMyUserDto = convertUserToDto(newUser);

	}

	@Override
	public MyUserDto convertUserToDto(MyUser myUser) {
		logger.trace("ENTERED……………………………………convertUserToDto()");

		MyUserDto myUserDto = new MyUserDto();

		// ... map properties from myUser to dto
		myUserDto.setId(myUser.getId());
		myUserDto.setUsername(myUser.getUsername());
		myUserDto.setPassword(myUser.getPassword());
		myUserDto.setRole(myUser.getRole());

		logger.trace("EXITED……………………………………convertUserToDto()");

		return myUserDto;
	}

	@Override
	public MyUser convertMyUserDtoToMyUser(MyUserDto myUserDto) {
		logger.trace("ENTERED……………………………………convertMyUserDtoToMyUser()");

		MyUser myUser = new MyUser();

		// ... map properties from myUser to myUserDto

		myUser.setUsername(myUserDto.getUsername());
		myUser.setPassword(myUserDto.getPassword());
		myUser.setRole(myUserDto.getRole());
		logger.trace("EXITED……………………………………convertMyUserDtoToMyUser()");
		return myUser;
	}

}
