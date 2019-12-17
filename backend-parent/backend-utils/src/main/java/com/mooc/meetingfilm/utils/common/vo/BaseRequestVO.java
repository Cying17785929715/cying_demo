package com.mooc.meetingfilm.utils.common.vo;

import com.mooc.meetingfilm.utils.exception.CommonServiceException;

/**
 * User: CYing
 * Date: 2019/12/17
 * Time: 11:12
 * Description:
 */
public abstract class BaseRequestVO {
    /**
     * @author     ：cying
     * @date       ：2019/12/17 11:13
     * @description：公共的参数验证
     */
    public abstract void checkParam() throws CommonServiceException;
}
