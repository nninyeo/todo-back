package com.min.todolist.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration  //WebMvcConfigurer을 상속받는다. 여러 Web mvc설정할수있다.
class WebConfig : WebMvcConfigurer{

    //어떤걸 허락할지 이런거 정하는곳. 레지스트리에 여러가지 설정가능
    //addMapping이라는것은 모든경로를 열어줄거다
    override fun addCorsMappings(registry: CorsRegistry) {
        registry
            .addMapping("/**")
            .allowedOrigins("http://localhost:3000")
            .allowedMethods(
                HttpMethod.GET.name,
                HttpMethod.POST.name,
                HttpMethod.PUT.name,
                HttpMethod.DELETE.name, //마지막쉼표가능.

            )
    }
}