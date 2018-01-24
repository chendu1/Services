package com.guigu.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/*")
public class Charset implements Filter {

    private FilterConfig  config=null;
    
    private String defaultCharset="UTF-8";
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
	    HttpServletRequest request=(HttpServletRequest) req;
	    HttpServletResponse response=(HttpServletResponse) res;
	    String charset=config.getInitParameter("charset");
	    if(charset==null) {
	        charset=defaultCharset;
	    }
	    request.setCharacterEncoding(charset);
	    response.setCharacterEncoding(charset);
	    response.setContentType("text/html;charset="+charset);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		 this.config=fConfig;
	}

}
