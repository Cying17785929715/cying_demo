package com.mooc.meetingfilm.user.dao;

import com.mooc.meetingfilm.user.BackendUserApplicationTests;
import com.mooc.meetingfilm.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.user.dao.mapper.MoocBackendUserTMapper;
import com.mooc.meetingfilm.utils.util.MD5Util;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * User: CYing
 * Date: 2019/12/16
 * Time: 10:41
 * Description:用户测试类
 */
public class UserTest extends BackendUserApplicationTests {
    @Autowired
    private MoocBackendUserTMapper backendUserTMapper;

    @Test
    public void add() {

            MoocBackendUserT user = new MoocBackendUserT();
            user.setUserName("admin");
            user.setUserPwd(MD5Util.encrypt("admin123"));
            user.setUserPhone("1888888888");
            backendUserTMapper.insert(user);


    }

    @Test
    public void selete() {
        List<MoocBackendUserT> list=backendUserTMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
