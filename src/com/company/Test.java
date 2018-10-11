package com.company;

public class Test {
    int intData;

    Test(){
        intData = 666;
    }
    protected void finalize(){}
    void showIntData(){
        System.out.println(intData);
        return;
    }
    void setIntData(int x){
        intData = x;
    }

}
