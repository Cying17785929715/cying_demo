package com.mooc.meetingfilm.utils.util;

/**
 * User: CYing
 * Date: 2019/12/17
 * Time: 11:21
 * Description:基础工具类
 */
public class ToolUtils {

    private ToolUtils(){}

    /**
     * @author     ：cying
     * @date       ：2019/12/17 11:24
     * @description：字符串为空
     */
    public static boolean strIsNull(String str){
        if(str==null||str.trim().length()==0){
            return  true;
        }else {
            return  false;
        }
    }

    /**
     * @author     ：cying
     * @date       ：2019/12/17 11:24
     * @description：字符串不为空
     */
    public static boolean strIsNotNull(String str){
        if(strIsNull(str)){
            return  false;
        }else {
            return  true;
        }
    }
}
