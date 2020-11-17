package com.lolixx.springbootredis.model;

import java.io.Serializable;

/**
 * <b>Description</b>: <br>
 * <b>email</b>:liuliuwujie@126.com <br>
 * <b>Author</b>:loulanqian<br>
 * <b>Date</b>: 2020/11/17 15:33<br>
 */
public class User implements Serializable {
    private int id;
    private String name;
    private Integer sex;
    private Integer age;

    public User(int id, String name, Integer sex, Integer age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
