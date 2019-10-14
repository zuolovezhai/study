package com.victory.study.bean;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zuoshengli
 **/
public class Student implements Serializable {
    private String sno;
    private String name;
    private String sex;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
