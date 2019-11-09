package com.classbook.chapter.six2;

//实现接口
public class ReadingMatterImpl implements ReadingMatterInte {

    //实现接口的两个方法
    @Override
    public void Effect() {
        System.out.println("(父类)可以阅读的！！");
    }

    @Override
    public void FitObject() {
        System.out.println("(父类)任何阶段的人都能读书");
    }

    //价格与页数的get方法
    public int getPrice() {
        return price;
    }

    public int getPagination() {
        return pagination;
    }

}
