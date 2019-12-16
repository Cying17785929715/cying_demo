package com.mooc.meetingfilm.backend.backend.user;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mooc.meetingfilm.backend.BackendCommonApplication;
import com.mooc.meetingfilm.backend.BackendCommonApplicationTests;
import com.mooc.meetingfilm.backend.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.dao.mapper.MoocBackendUserTMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: CYing
 * Date: 2019/12/16
 * Time: 10:41
 * Description:用户测试类
 */
public class UserTest extends BackendCommonApplicationTests {
    @Autowired
    private MoocBackendUserTMapper backendUserTMapper;

    @Test
    public void add() {
        for (int i=0;i<5;i++){
            MoocBackendUserT user = new MoocBackendUserT();
            user.setUserName("admin"+i);
            user.setUserPhone("1778592971"+i);
            user.setUserPwd("admin"+i);
            backendUserTMapper.insert(user);
        }

    }

    @Test
    public void selete() {
//        MoocBackendUserT userT = backendUserTMapper.selectById(2);
//        System.out.println("受影响行" + userT);
//        List<MoocBackendUserT> list=backendUserTMapper.selectList(null);
//        list.forEach(System.out::println);

        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("user_name","admin4");
        List<MoocBackendUserT> list=backendUserTMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    @Test
    public void update() {
        MoocBackendUserT user = new MoocBackendUserT();
        user.setUuid(2);
        user.setUserName("admin");
        user.setUserPwd("chenying");
        user.setUserPhone("18512341234");
        int rows = backendUserTMapper.updateById(user);
        System.out.println(rows);
    }

    @Test
    public  void del(){
        backendUserTMapper.deleteById(3);
    }
}
