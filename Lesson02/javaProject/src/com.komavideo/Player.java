//包定义
package com.komavideo;
//类定义
public class Player {
    //内部属性
    private String name;

    //构造器
    public Player(String name) {
        this.name = name;
    }

    //标准类方法
    public void shootBall2() {
        System.out.println(this.name + " 2分投球！");
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
}