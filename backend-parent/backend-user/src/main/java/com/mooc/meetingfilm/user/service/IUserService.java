package com.mooc.meetingfilm.user.service;

import com.mooc.meetingfilm.utils.exception.CommonServiceException;

/**
 * User: CYing
 * Date: 2019/12/17
 * Time: 14:15
 * Description:
 */
public interface IUserService {
    String checkUserLogin(String username,String password) throws CommonServiceException;
}
