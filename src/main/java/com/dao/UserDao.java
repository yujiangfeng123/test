package com.dao;

import org.apache.ibatis.annotations.Select;
 /*
  * @author: 余江峰
  * @date: 2019/4/15 16:21
  * @Description: 用户dao
  */
public interface UserDao {
    String getName(long userId);
}
