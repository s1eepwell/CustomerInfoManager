package com.zz.controller;

import com.tools.java.CMUtility;
import com.zz.module.Customer;
import com.zz.module.CustomerList;
import com.zz.view.CustomerView;

public class Test {
    public static void main(String[] args) {
        //创建多个实例以调用各自方法
        CustomerView customerView = new CustomerView();
        CustomerList customerList = new CustomerList(0);
        //Customer是CustomerList的属性
        customerList.customers = new Customer[10];
        //展示主界面
        customerView.enterMainMenu();
        //以下while结构使得主界面功能循环使用直至退出程序(break循环)
        while (true){
            //调用CMUtility工具类提供的方法
            char menu = CMUtility.readMenuSelection();
            //1-5分别对应主界面选项
            switch(menu){
                case '1':
                    //CustomerView界面的添加客户功能
                    customerView.addNewCutomer(customerList);
                    //回到主界面
                    customerView.enterMainMenu();
                    continue;
                case '2':
                    System.out.println("请输入要修改的客户的序号：");
                    int num1 = CMUtility.readInt();
                    //索引加1即序号
                    customerView.modifyCustomer(customerList,num1 - 1);
                    customerView.enterMainMenu();
                    continue;


                case '3':
                    System.out.println("请输入待删除客户的序号：");
                    //num是序号，num-1即索引
                    int num = CMUtility.readInt();
                    customerView.deleteCustomer(customerList.customers, customerList, num - 1);
                    customerView.enterMainMenu();
                    continue;
                case '4':
                    customerView.listAllCustomer(customerList.customers, customerList);
                    System.out.println("输入Y回到主界面");
                    char confirm = CMUtility.readConfirmSelection();
                    if (confirm == 'Y'){
                        customerView.enterMainMenu();
                        continue;
                    }else {
                        System.out.println("输入错误！程序退出！");
                        break;
                    }

                case '5':
                    //终止switch循环
                    break;
            }
            //终止while循环
            break;
        }
    }
}
