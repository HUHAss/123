package com.classbook.chapter.six2;

//课本，继承了接口的实现类
public class TextBook extends ReadingMatterImpl {

    String name = "课本";

    //覆盖父类的两个方法
    @Override
    public void Effect() {
        System.out.println("课本是用来学习的！");
    }
    @Override
    public void FitObject() {
        System.out.println("课本最适合的使用对象是学生");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "课本 ：" +  "价格 = " + price + " , 页数 = " + pagination;
    }
}
