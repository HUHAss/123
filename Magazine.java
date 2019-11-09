package com.classbook.chapter.six2;

//杂志，继承了接口的实现类
public class Magazine extends ReadingMatterImpl {
    String name = "杂志";
    //出版周期
    String date = "30 day";

    //覆盖父类方法
    @Override
    public void Effect() {
        System.out.println("这是继承了读物类的杂志类");
    }
    //返回该类描述的读物
    public String getName() {
        return name;
    }
    //返回杂志的出版周期
    public String getDate() {
        return date;
    }

    //重写toString方法
    public String toString() {
        return "杂志：" +  "价格 = " + price + " , 页数 = " + pagination + " , 出版周期 = " + date;
    }
}
