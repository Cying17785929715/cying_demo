package com.mooc.meetingfilm.user.controller;

import com.mooc.meetingfilm.user.controller.VO.LoginReqVO;
import com.mooc.meetingfilm.user.service.IUserService;
import com.mooc.meetingfilm.utils.common.vo.BaseResponseVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import com.mooc.meetingfilm.utils.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * User: CYing
 * Date: 2019/12/17
 * Time: 11:08
 * Description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResponseVO login(@RequestBody LoginReqVO loginReqVO) throws CommonServiceException{
        //数据验证
        loginReqVO.checkParam();

        //验证用户名是否正确
        String userId=service.checkUserLogin(loginReqVO.getUsername(),loginReqVO.getPassword());

        JwtTokenUtil jwtTokenUtil=new JwtTokenUtil();
        String randomKey=jwtTokenUtil.getRandomKey();
        String token=jwtTokenUtil.generateToken(userId,randomKey);

        Map<String,String> result=new HashMap<>();
        result.put("randomKey",randomKey);
        result.put("token",token);
        return  BaseResponseVO.success(result);
    }
}
