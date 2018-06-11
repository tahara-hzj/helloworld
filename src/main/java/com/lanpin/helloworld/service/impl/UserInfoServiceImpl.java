package com.lanpin.helloworld.service.impl;

import com.lanpin.helloworld.pojo.UserInfo;
import com.lanpin.helloworld.service.UserInfoSercvice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoSercvice {

    @Override
    public List<UserInfo> queryUserList() {
        return null;
    }

    @Override
    public void addUserInfo() {

    }
}
