package com.zhiguogongfang.service.impl;

import com.zhiguogongfang.dao.UserInfoDao;
import com.zhiguogongfang.entity.UserInfo;
import com.zhiguogongfang.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
