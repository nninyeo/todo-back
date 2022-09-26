package com.min.todolist.repository

import org.springframework.data.repository.CrudRepository

//이 인터페이스는 Todo.kotlin를 조작할거다. 기본적으로 스프링이가진 CRUD리파지토리 상속받을예정. 중괄호 노필요. 지워

interface TodoRepository : CrudRepository<Todo, Long>