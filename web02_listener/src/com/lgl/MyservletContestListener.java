package com.lgl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class MyservletContestListener implements ServletContextListener{


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("加载springmvc的核心配置文件");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
         System.out.println("释放对象的内存");
    }
}
