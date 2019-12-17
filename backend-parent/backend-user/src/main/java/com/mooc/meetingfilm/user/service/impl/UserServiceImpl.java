package com.mooc.meetingfilm.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mooc.meetingfilm.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.user.dao.mapper.MoocBackendUserTMapper;
import com.mooc.meetingfilm.user.service.IUserService;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import com.mooc.meetingfilm.utils.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: CYing
 * Date: 2019/12/17
 * Time: 14:17
 * Description:用户模块业务实现
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private MoocBackendUserTMapper userTMapper;

    @Override
    public String checkUserLogin(String username, String password) throws CommonServiceException {
        //根据用户名获取用户信息
        String pwd= MD5Util.encrypt(password);
        QueryWrapper<MoocBackendUserT> queryWrapper=new QueryWrapper<MoocBackendUserT>();
        queryWrapper.eq("user_name",username).eq("user_pwd",pwd);
        MoocBackendUserT user=userTMapper.selectOne(queryWrapper);
        if(user==null)
        {
          throw new CommonServiceException(404,"用户名密码错误");
        }
        return user.getUuid()+"";
        //验证密码是否正确

    }
}
