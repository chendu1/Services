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
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��4������2:26:47 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class SimpleFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("���г�ʼ��������1....");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
        
        System.out.println("�ڷ���Ŀ����Դ֮ǰִ��ĳЩ����.........aaaa");
        
        //�����Ƿ���е�Ŀ����Դ
        chain.doFilter(request, response);
        
        System.out.println("�ڷ���Ŀ����Դ֮��ִ��ĳЩ����......bbbb");
    }

    @Override
    public void destroy() {

    }

}
