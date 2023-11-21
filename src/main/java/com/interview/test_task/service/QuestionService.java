package com.interview.test_task.service;

import com.interview.test_task.dao.QuestionDao;
import com.interview.test_task.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestionService {

    private final QuestionDao questionDao;

    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public Question retrieveRandomQuestion() {
        List<Question> all = questionDao.findAll();
        Random random = new Random();
        return all.get(random.nextInt(all.size()));
    }
}
