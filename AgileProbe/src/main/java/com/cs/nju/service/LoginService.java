package com.cs.nju.service;

import com.cs.nju.entity.User;

/**
 * Created by maicius on 2017/3/31.
 */
public interface LoginService {
    User doUserLogin(User user) throws Exception;
    User doUserVerify(User user) throws Exception;
}
