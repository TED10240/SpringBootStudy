package com.tjmakebug.springboot.service.impl;

import com.tjmakebug.springboot.mapper.StudentMapper;
import com.tjmakebug.springboot.model.Student;
import com.tjmakebug.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentId(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
