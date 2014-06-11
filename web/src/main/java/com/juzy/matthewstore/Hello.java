package com.juzy.matthewstore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * User: xizhao.xsz
 * Time:2014-05-22 11:44
 */
public class Hello extends HttpServlet {
    private int count=0;
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("HttpServlet count="+count);
        count++;
                 response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!Welcome to matthew's store</h1>");

        out.println("contextpath"+request.getContextPath());
        out.println("cookies="+request.getCookies());
        out.println("pathInfo"+request.getPathInfo());
        out.println("serverport"+request.getServerPort());
        out.println("</body>");
        out.println("</html>");
    }

}


