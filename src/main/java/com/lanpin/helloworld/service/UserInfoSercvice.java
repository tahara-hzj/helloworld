package com.lanpin.helloworld.service;

import com.lanpin.helloworld.pojo.UserInfo;

import java.util.List;

public interface UserInfoSercvice {

    List<UserInfo> queryUserList();

    void addUserInfo();

}
