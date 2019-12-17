package com.mooc.meetingfilm.user.controller.VO;

import com.mooc.meetingfilm.utils.common.vo.BaseRequestVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import com.mooc.meetingfilm.utils.util.ToolUtils;
import lombok.Data;

/**
 * User: CYing
 * Date: 2019/12/17
 * Time: 11:10
 * Description:
 */
@Data
public class LoginReqVO extends BaseRequestVO {
    private String username;
    private String password;

    @Override
    public void checkParam() throws CommonServiceException {
        //验证数据合法性
        if(ToolUtils.strIsNull(username)||ToolUtils.strIsNull(password)){
            throw  new CommonServiceException(404,"username and password is null");
        }
    }
}
