package com.victory.study.service;

import com.victory.study.bean.Student;

/**
 * @Description TODO
 * @Author zuoshengli
 **/
public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBySno(String sno);
    Student queryStudentBySno(String sno);
}
