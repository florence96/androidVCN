package com.example.helloworld;

public class item {//클래스 명은 대문자로 시작
    private int image;//이미지는 숫자로 저장이 됨
    private String flowername;

    public int getImage(){return image;}
    public String getFlowername(){return flowername;}

    public item(int image, String flowername){
        this.image = image;
        this.flowername = flowername;
    }
}
