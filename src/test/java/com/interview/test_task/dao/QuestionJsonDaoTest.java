package com.interview.test_task.dao;

import com.interview.test_task.entity.Question;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionJsonDaoTest {

    @Test
    void findAll() {
        QuestionDao questionDao = new QuestionJsonDao();
        List<Question> questions = questionDao.findAll();
        assertEquals(questions.size(), 3);
    }
}
