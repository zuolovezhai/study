package com.victory.study.controller;

import com.victory.study.bean.Student;
import com.victory.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author zuoshengli
 **/
@RestController
public class TestController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/queryStudent", method=RequestMethod.GET)
    public Student queryStudentBySno(String sno) {
        return this.studentService.queryStudentBySno(sno);
    }
}
