package com.mooc.meetingfilm.backend.dao.mapper;

import com.mooc.meetingfilm.backend.dao.entity.MoocBackendUserT;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author chenying
 * @since 2019-12-16
 */
public interface MoocBackendUserTMapper extends BaseMapper<MoocBackendUserT> {
    MoocBackendUserT desctibeUserByUserNmae(@Param("username") String username);

}
