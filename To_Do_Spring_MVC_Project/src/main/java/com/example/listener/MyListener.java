package com.example.listener;

import com.example.entity.Todo;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.util.ArrayList;
import java.util.List;


// ServletContext is a Object which is only one for whole website
// when we deploy project object is created by WebContainer

public class MyListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce){
    }

    public void contextInitialized(ServletContextEvent sce){
        System.out.println("Servlet Context Created.....");
        List<Todo> list = new ArrayList<Todo>();
        ServletContext context = sce.getServletContext();
        context.setAttribute("list", list);

    }
}
