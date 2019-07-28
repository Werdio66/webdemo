package com._520.extend;

import javax.servlet.*;
import java.io.IOException;

public class Servlet1 extends MyGenericServlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //super.init(servletConfig);
        System.out.println("子类初始化");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
