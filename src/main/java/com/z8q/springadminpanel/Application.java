package com.z8q.springadminpanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


// нужно добавить смену пароля


// при первом запуске в пропертис вот эту строку spring.jpa.hibernate.ddl-auto=validate  сделать true
// чтоб таблицы создались