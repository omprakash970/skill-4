package com.klu.skill4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student()
    {
        Student s = new Student(32058, "Om Prakash", "Computer Science", 2);
            //Setter Injection
            s.setCourse("Full Stack Development");
            s.setYear(2);

            return s;
    }

}
