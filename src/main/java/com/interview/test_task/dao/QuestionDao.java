package com.interview.test_task.dao;

import com.interview.test_task.entity.Question;

import java.util.List;

public interface QuestionDao {

    List<Question> findAll();
}
