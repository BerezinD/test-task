package com.interview.test_task.controller;

import com.interview.test_task.entity.Question;
import com.interview.test_task.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/v1/questions")
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/random")
    public Question retrieveRandomQuestion() {
        return service.retrieveRandomQuestion();
    }

    ResponseEntity<?> sendAnswer() {
        return null;
    }

    ResponseEntity<?> getStatistics(){
        return null;
    }
}
