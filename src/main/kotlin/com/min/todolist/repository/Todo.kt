package com.min.todolist.repository

import org.hibernate.annotations.ColumnDefault
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

//Todo라는 코틀린클래스는 디비 테이블과 맵핑되는 엔터티 역할을 해줄거다. 그래서 @Entity함
//원래 중괄호로 싸져있는데 생성자로 만들어줘야해서 {}를 ()로 바꿈. 로직이따로없으면 중괄호를 생략해줄수있음.
@Entity
class Todo(
    @Id //pk이고 널은 불가.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column (nullable = false)  //널막기
    @ColumnDefault ("false")    //컬럼 디본값: 펄스로 지정하겠다는거 스트링으로.
    var completed: Boolean = false,//완료여부

    @Column (nullable = false)
    var todoName: String

)