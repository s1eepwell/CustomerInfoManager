package com.zz.module;

import com.zz.view.CustomerView;

public class CustomerList {
    public Customer[] customers;
    private int total;//记录已保存客户对象的数量

    //构造器
    public CustomerList(int totalCustomer){//totalCustomer:指定数组的长度
        customers = new Customer[totalCustomer];
    }
    //将参数customer添加到数组中最后一个客户对象之后
    public boolean addCustomer(Customer cust){
        if (total >= customers.length){
            System.out.println("客户数组已经满了！");
            return false;
        }else {
            customers[total] = cust;
            total++;
            return true;
        }

    }
    //方法：返回total（当前已保存客户对象的数量）

    public int getTotal() {
        return total;
    }

    //用参数customer替换数组中由index指定的对象
    public boolean replaceCustomer(int index, Customer cust){
        if (index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    //从数组中删除参数index指定索引位置的客户对象记录
    public boolean delete(int index){
        if (index < 0 || index >= total){
            return false;
        }
        for (int i = index; i < total -1; i++){
            customers[index] = customers[index + 1];
        }
        //最后一个元素置空
        customers[total - 1] = null;
        total--;
        return true;
    }
    //返回数组中记录的所有客户对象
    public Customer[] getAllCustomers(){
        Customer [] custs = new Customer[total];
        for (int i = 0 ;i < total; i++){
            custs[i] = customers[i];
        }
        return custs;
    }
    //返回参数index指定索引位置的客户对象记录
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }
public static void main(String[] args) {

}
}
