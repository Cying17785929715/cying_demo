package com.mooc.meetingfilm.utils.exception;

import lombok.Data;

/**
 * User: CYing
 * Date: 2019/12/17
 * Time: 11:16
 * Description:公共的业务逻辑错误
 */
@Data
public class CommonServiceException extends Exception {
    private Integer code;
    private String  message;

    public CommonServiceException(int code,String message){
        this.code=code;
        this.message=message;

    }
}
