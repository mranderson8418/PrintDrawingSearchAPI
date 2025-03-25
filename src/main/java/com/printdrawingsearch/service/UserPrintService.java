package com.printdrawingsearch.service;

import com.printdrawingsearch.dto.MyUserDto;
import com.printdrawingsearch.model.MyUser;

public interface UserPrintService {


   void createUser(MyUserDto myUserDto);

    MyUserDto convertUserToDto(MyUser myUser);

    MyUser convertMyUserDtoToMyUser(MyUserDto myUserDto);
}
