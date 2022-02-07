package com.zz.module;

public class Customer {
    private String name;//客户姓名
    private String gender;//性别
    private int age;//年龄
    private String phone;//电话号码
    private String email;//电子邮箱

    //设置姓名
    public void setName(String name) {
        this.name = name;
    }

    //获取姓名
    public String getName(){
        return name;
    }

    //设置性别
    public void setGender(String gender) {
        this.gender = gender;
    }

    //获取性别

    public String getGender() {
        return gender;
    }
    //设置年龄

    public void setAge(int age) {
        this.age = age;
    }
    //获取年龄

    public int getAge() {
        return age;
    }
    //设置电话号码

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //获取电话号码

    public String getPhone() {
        return phone;
    }
    //设置邮箱

    public void setEmail(String email) {
        this.email = email;
    }
    //获取邮箱

    public String getEmail() {
        return email;
    }



    public static void main(String[] args) {

    }
}
