package com.web;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
  *@ClassName UserContrller
  *@Description 用户类
  *@Author 余江峰
  *@Date 2019/4/15 14:51
   **/
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserContrller {

    @Autowired
    private UserService userService;
     /*
      * @author: 余江峰
      * @date: 2019/4/15 14:52
      * @Description: 获取用户名
      * @param: userID 用户id
      * @return:  用户名
      */
     @RequestMapping("/getName")
    public String getName(Long userId){
         String name = userService.getName(userId);

         return name;
    }
}
