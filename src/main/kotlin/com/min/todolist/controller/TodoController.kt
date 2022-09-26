package com.min.todolist.controller

import com.min.todolist.service.TodoService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/todo") //  /todo는 todo url통해 들어온다고... 각 요청방식에 따라 알아서 분기됨.
class TodoController(

    //*

    //서비스 연결함.
    private val todoService: TodoService


) {

    @GetMapping
    fun getTodos() = todoService.getTodos()


    @PostMapping
    fun insertTodo(@RequestBody todoRequest: TodoRequest) = todoService.insertTodo(todoRequest.todoName)

    @PutMapping(path = ["/{todoId}"])
    fun updateTodo(@PathVariable("todoId") todoId:Long ) = todoService.updateTodo(todoId)


    @DeleteMapping(path = ["/{todoId}"])
    fun deleteTodo(@PathVariable("todoId") todoId:Long ) = todoService.deleteTodo(todoId)

}