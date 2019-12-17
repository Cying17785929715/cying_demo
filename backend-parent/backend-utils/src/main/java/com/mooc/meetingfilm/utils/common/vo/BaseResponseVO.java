package com.mooc.meetingfilm.utils.common.vo;

import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import lombok.Data;

/**
 * User: CYing
 * Date: 2019/12/17
 * Time: 9:08
 * Description:表现层公共返回
 */
@Data
public class BaseResponseVO<T> {
   private Integer code;//业务编号
   private String message; //异常信息
   private T data;   //返回数据

    private  BaseResponseVO(){}

    /**
     * @author     ：cying
     * @date       ：2019/12/17 13:44
     * @description：成功无参数返回
     */
    public static BaseResponseVO success(){
        BaseResponseVO response=new BaseResponseVO();
        response.setCode(200);
        response.setMessage("");
        return response;
    }

    /**
     * @author     ：cying
     * @date       ：2019/12/17 13:45
     * @description：成功有参数返回
     */
    public static<T> BaseResponseVO success(T data){
        BaseResponseVO response=new BaseResponseVO();
        response.setCode(200);
        response.setMessage("");
        response.setData(data);
        return  response;

    }

    /**
     * @author     ：cying
     * @date       ：2019/12/17 13:45
     * @description：出现业务异常
     */
    public static<T> BaseResponseVO serviceException(CommonServiceException e){
        BaseResponseVO response=new BaseResponseVO();
        response.setCode(e.getCode());
        response.setMessage(e.getMessage());
        return  response;

    }



}
