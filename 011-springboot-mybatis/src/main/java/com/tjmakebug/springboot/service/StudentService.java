package com.tjmakebug.springboot.service;

import com.tjmakebug.springboot.model.Student;

public interface StudentService {

    /**
     * 根据id查询：
     * @param id
     * @return
     */
    Student queryStudentId(Integer id);
}
