package com.victory.study.dao;

import com.victory.study.bean.Student;

import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author zuoshengli
 **/
public interface StudentDao {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    List<Map<String,Object>> queryStudentsListMap();
    Student queryStudentBySno(String sno);
}
