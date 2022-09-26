package com.min.todolist.service

import com.min.todolist.repository.Todo
import com.min.todolist.repository.TodoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

//첨에 ()괄호없는데 괄호만들어줘야함.
@Service
class TodoService (

    //서비스에서 Repo로 연결해줘야함
    private val todoRepository: TodoRepository
){//기능

    //전체할일목록 불러오기
    fun getTodos() = todoRepository.findAll()

    //할일추가기능
    fun insertTodo(todoName: String): Todo = todoRepository.save(Todo(todoName = todoName))
    //할일이 한줄로끝나서 =로 중괄호없이 했음.

    //완료치는기능
    fun updateTodo(todoId: Long): Todo {  //글이글어질거같아서 중괄호
        var todo = todoRepository.findByIdOrNull(todoId) ?: throw Exception() //데이터 없으면 예외발생
        todo.completed = !todo.completed    //완료가 됬으면 미완료로, 미완료면 완료로
        return todoRepository.save(todo)    //리턴해줌 변경값을
    }

    //제거기능
    fun deleteTodo(todoId: Long) = todoRepository.deleteById(todoId)
}
//~16:24