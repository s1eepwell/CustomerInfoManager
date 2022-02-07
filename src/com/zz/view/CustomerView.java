package com.zz.view;

import com.zz.module.Customer;
import com.zz.module.CustomerList;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerView {

    /*
    显示主菜单，响应用户输入，根据用户操作分别调用其他相
    应的成员方法（如addNewCustomer），以完成客户信息处理。
     */
    public void enterMainMenu(){
        System.out.println("——————————————客户信息管理软件——————————————");
        System.out.println();
        System.out.println("              1.添 加 客 户");
        System.out.println("              2.修 改 客 户");
        System.out.println("              3.删 除 客 户");
        System.out.println("              4.客 户 列 表");
        System.out.println("              5.退      出");
        System.out.println("请输入选项：");
    }

    //添加新客户
    public Customer addNewCutomer(CustomerList customerList){
        Customer customer = new Customer();

        System.out.println("请输入客户姓名：");
        Scanner scan = new Scanner(System.in);
        customer.setName(scan.next());
        System.out.println("请输入客户性别：");
        customer.setGender(scan.next());
        System.out.println("请输入客户年龄：");
        customer.setAge(scan.nextInt());
        System.out.println("请输入客户电话号码：");
        customer.setPhone(scan.next());
        System.out.println("请输入客户电子邮箱：");
        customer.setEmail(scan.next());

        customerList.addCustomer(customer);

        //添加后的界面
        System.out.println("——————————————添加客户——————————————");
        System.out.println("姓名：" + customer.getName());
        System.out.println("性别：" + customer.getGender());
        System.out.println("年龄：" + customer.getAge());
        System.out.println("电话：" + customer.getPhone());
        System.out.println("邮箱：" + customer.getEmail());
        System.out.println("——————————————添加成功——————————————");
        return customer;

    }


    //修改客户，调用replaceCustomer
    public Customer modifyCustomer(CustomerList customerList,int index){
        Customer customer1 = new Customer();
        System.out.println("请输入客户姓名：");
        Scanner scan = new Scanner(System.in);
        customer1.setName(scan.next());
        System.out.println("请输入客户性别：");
        customer1.setGender(scan.next());
        System.out.println("请输入客户年龄：");
        customer1.setAge(scan.nextInt());
        System.out.println("请输入客户电话号码：");
        customer1.setPhone(scan.next());
        System.out.println("请输入客户电子邮箱：");
        customer1.setEmail(scan.next());

        customerList.replaceCustomer(index,customer1);
        return customer1;

    }
    //删除客户
    public void deleteCustomer(Customer[] customers,CustomerList customerList,int index){
        customerList.delete(index);
    }
    //展示客户列表
    public void listAllCustomer(Customer[] customers,CustomerList customerList){
        System.out.println("——————————————客户列表——————————————");
        System.out.println("编号" + "   姓名" + "       性别" + "     年龄" + "      电话" + "            邮箱");
        for (int i = 0; i < customerList.getTotal(); i++){
            System.out.println(i + 1 + "    " + customers[i].getName() + "    " + customers[i].getGender() + "     " + customers[i].getAge() + "    " + customers[i].getPhone() + "    " + customers[i].getEmail() );
        }

    }

}
