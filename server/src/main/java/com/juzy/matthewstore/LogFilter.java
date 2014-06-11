package com.juzy.matthewstore;

import javax.servlet.*;
import java.io.IOException;

/**
 * User: xizhao.xsz
 * Time:2014-05-23 11:44
 */
public class LogFilter  implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {


    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter......getRemoteAddr="+request.getRemoteAddr());
        System.out.println("doFilter......getRemoteHost="+request.getRemoteHost());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy......");
    }
}
