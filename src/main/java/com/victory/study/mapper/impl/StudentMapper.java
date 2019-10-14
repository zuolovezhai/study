package com.victory.study.mapper.impl;

import com.victory.study.bean.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description TODO
 * @Author zuoshengli
 **/
public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setSno(resultSet.getString("sno"));
        student.setName(resultSet.getString("sname"));
        student.setSex(resultSet.getString("ssex"));
        return student;
    }
}
