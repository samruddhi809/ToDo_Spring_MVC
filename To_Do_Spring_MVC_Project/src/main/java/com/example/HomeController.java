package com.example;

import com.example.entity.Todo;
import jakarta.servlet.ServletContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model m, HttpServletRequest request) {
        m.addAttribute("page", "home");
        ServletContext context = request.getServletContext();
        List<Todo>list = (List<Todo>) context.getAttribute("list");
        m.addAttribute("todos",list);
        return "home";
    }

    @RequestMapping("/add")
    public String addTodo(Model m) {
        Todo t = new Todo();
        m.addAttribute("page", "add");
        m.addAttribute("todo", t);
        return "home";
    }

    @RequestMapping(value = "/saveTodo", method = RequestMethod.POST)
    public String saveTodo(@ModelAttribute("todo") Todo t, Model m, HttpServletRequest request) {
        System.out.println(t);
        t.setTodoDate(String.valueOf(new Date()));
        ServletContext context = request.getServletContext();
        List<Todo> list = (List<Todo>) context.getAttribute("list");
        list.add(t);
        m.addAttribute("msg", "Successfully Added....");
        return "home";
    }
}

