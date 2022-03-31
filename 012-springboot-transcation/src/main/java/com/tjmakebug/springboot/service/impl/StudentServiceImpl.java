package com.tjmakebug.springboot.service.impl;

import com.tjmakebug.springboot.mapper.StudentMapper;
import com.tjmakebug.springboot.model.Student;
import com.tjmakebug.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentId(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Transactional//添加事务
    @Override
    public int updateStudentId(Student student) {

        int i = studentMapper.updateByPrimaryKey(student);
        int a = 10/0;
        return i;
    }


}
