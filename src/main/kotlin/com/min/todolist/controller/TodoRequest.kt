package com.min.todolist.controller


//롬복같은 기능 *(데이터클래스), 애는 dto역할을 한다. 스프링 내장 잭슨을 통해 알아서 변환해줌.
data class TodoRequest (val todoName: String)