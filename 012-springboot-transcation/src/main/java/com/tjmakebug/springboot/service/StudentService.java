package com.tjmakebug.springboot.service;

import com.tjmakebug.springboot.model.Student;

public interface StudentService {

    Student queryStudentId(Integer id);

    /**
     * 根据学生id修改学生信息
     * @param student
     * @return
     */
    int updateStudentId(Student student);
}
