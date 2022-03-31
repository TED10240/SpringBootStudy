package com.tjmakebug.springboot.web;

import com.tjmakebug.springboot.model.Student;
import com.tjmakebug.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object student(Integer id){
        Student student = studentService.queryStudentId(id);
        return student;
    }

    @RequestMapping(value = "/update")
    public @ResponseBody Object update(Integer id,String name,Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        student.setId(id);
        int updateCount = studentService.updateStudentId(student);
        return "修改成功";
    }

}
