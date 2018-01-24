package com.guigu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**       
 * <p>project_name:JavaFilter</p>
 * <p>package_name:com.guigu.filter.SimpleFilter1</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月4日下午2:26:47 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class SimpleFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("进行初始化过滤器1....");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
        
        System.out.println("在访问目标资源之前执行某些事情.........aaaa");
        
        //决定是否放行到目标资源
        chain.doFilter(request, response);
        
        System.out.println("在访问目标资源之后执行某些事情......bbbb");
    }

    @Override
    public void destroy() {

    }

}
