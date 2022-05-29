package ru.mirea.senebank.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Класс для обработки запросов перехода на другие страницы
 */
@Controller
@Slf4j
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public String mainPage(){

        log.info("Запрос индексной страницы");

        return "main";
    }

    @GetMapping("/reg")
    public String regPage(){
        return "registration";
    }

}
