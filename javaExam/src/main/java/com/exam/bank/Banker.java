package com.exam.bank;

import java.util.Scanner;

public class Banker {
    String name;

    Banker(String name){
        this.name = name;
    }

    public void startJob(Bank bank){
        Scanner customerInput = new Scanner(System.in);
        System.out.println("어서오세요^^");
        System.out.println("통장이 있으시면 1번 없으시면 2번을 입력하세요.");
        int accountInfo = customerInput.nextInt();

        if(accountInfo == 1){
            System.out.println("통장 번호를 입력해 주세요. 모르면 no를 입력해주세요.");

        }else{

            //새로운 통장 생성 ( 이 메서드는 누가 가지는게 좋을까?)
        }
    }
}
