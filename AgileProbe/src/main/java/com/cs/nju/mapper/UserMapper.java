package com.cs.nju.mapper;

import com.cs.nju.entity.User;

/**
 * Created by maicius on 2017/3/31.
 */
public interface UserMapper {
    User doUserLogin(User user) throws Exception;
    User doUserVerify(User user) throws Exception;
}
