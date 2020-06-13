package com.gjt.config;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author ：com.gjt
 * @description：TODO
 * @date ：Created in 2020/6/9 23:54
 */
public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String jwt){
        this.token = jwt;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
