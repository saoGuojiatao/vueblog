package com.gjt.util;

import com.gjt.shiro.AccountProfile;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;

/**
 * @author ：com.gjt
 * @description：TODO
 * @date ：Created in 2020/6/10 19:14
 */
public class ShiroUtil {

    public static AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
