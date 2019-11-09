package com.classbook.chapter.six2;

//期刊
public class Periodical extends ReadingMatterImpl {
    String name = "期刊";
    //出版周期
    String date = "7 day";

    //覆盖父类方法
    @Override
    public void Effect() {
        System.out.println("期刊...真不知道能干嘛了");
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
        return "期刊：" +  "价格 = " + price + " , 页数 = " + pagination + " , 出版周期 = " + date;
    }
}
