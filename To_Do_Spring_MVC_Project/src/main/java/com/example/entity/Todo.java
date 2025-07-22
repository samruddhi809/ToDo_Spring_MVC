package com.example.entity;

public class Todo {
    private String todoTitle;
    private String todoContent;
    private String todoDate;

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    public String getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(String todoDate) {
        this.todoDate = todoDate;
    }

    public Todo(String todoTitle, String todoContent, String todoDate) {
        this.todoTitle = todoTitle;
        this.todoContent = todoContent;
        this.todoDate = todoDate;
    }

    @Override
    public String toString() {
        return this.getTodoTitle()+" : "+ this.todoContent;
    }

    public Todo() {
        super();
    }
}
