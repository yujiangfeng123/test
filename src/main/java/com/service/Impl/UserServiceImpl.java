package com.service.Impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
  *@ClassName UserServiceImpl
  *@Description 用户service实现类
  *@Author 余江峰
  *@Date 2019/4/15 15:01
   **/
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
     /*
      * @author: 余江峰
      * @date: 2019/4/15 15:01
      * @Description: 获取用户名
      * @param:
      * @return:
      */
    public String getName(long userId) {
        return userDao.getName(userId);
    }
}
