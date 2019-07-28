package com._520.param;

import com.sun.deploy.config.PluginServerConfig;

import javax.servlet.*;
import java.io.IOException;

public class InitParamServlet implements Servlet {
    //private String encoding;
    private ServletConfig config;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
       // encoding = servletConfig.getServletName();
        this.config = servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String encoding = config.getServletName();
        if("GB".equals(encoding)){
            System.out.println("hello");
        }else {
            System.out.println("你好");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
