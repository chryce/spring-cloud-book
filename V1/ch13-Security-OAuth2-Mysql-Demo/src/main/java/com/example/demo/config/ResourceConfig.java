package com.example.demo.config;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author: longzhonghua
 * @date: 2019/10/9
 * Description:
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)//判断用户对某个控制层的方法是否具有访问权限
public class ResourceConfig extends ResourceServerConfigurerAdapter {

    @Autowired
    private AuthenticationSuccessHandler myAuthenticationSuccessHandler;

    @Autowired
    private AuthenticationFailureHandler myAuthenticationFailHander;

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http.antMatcher("/user/**").
                formLogin().usernameParameter("username").passwordParameter("password").loginPage("/user/login").successHandler(
                myAuthenticationSuccessHandler).failureHandler(myAuthenticationFailHander)
                .and()
                .authorizeRequests();
        http.authorizeRequests().antMatchers("/user/register").permitAll();
        //由于所有接口默认会被资源服务器保护的，所以这个地方我们需要放行注册接口
        http.csrf().disable().httpBasic().disable().exceptionHandling().authenticationEntryPoint((req, resp, exception) -> {
            resp.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            resp.getWriter().write(new ObjectMapper().writeValueAsString(new HashMap() {{
                put("status", 403);
                put("error", "没有权限");
            }}));
        }).and().authorizeRequests().antMatchers("/noauth").permitAll();
    }
}
