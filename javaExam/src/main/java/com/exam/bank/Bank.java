package com.exam.bank;

import java.util.ArrayList;
import java.util.List;

//은행
public class Bank {
    private String name; //은행명
    private List<Customer> customers = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

//    private Customer[] customers = new Customer[10];
//    private Account[] accounts = new Account[50];

    //은행이 기본으로 가질 초기데이터를 입력하는 코드를 추가해 주세요.
    Bank(){
//        customers[0] = new Customer();
        customers.add(new Customer());
    }

    //open 은행문을 열때 해야하는 작업이 있다면 ..
    public void open(){
        System.out.println("======================은행업무 시작!!=============");
        Banker banker = new Banker("kim");
        banker.startJob(this);


    }


    //은행문을 닫을 때 해야할 작업이 있다면 구현..
    public void close(){

    }

    //통장생성
    public Account createAccount(){


        return null;
    }


}
