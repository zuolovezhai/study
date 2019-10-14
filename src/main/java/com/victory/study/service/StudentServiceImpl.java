package com.victory.study.service;

import com.victory.study.bean.Student;
import com.victory.study.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author zuoshengli
 **/
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int add(Student student) {
        return this.studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public int deleteBySno(String sno) {
        return this.studentMapper.deleteBySno(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentMapper.queryStudentBySno(sno);
    }
}
