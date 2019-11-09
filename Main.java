package com.classbook.chapter.six2;

//主函数
public class Main {
    public static void main(String[] args) {
        //创建四个类的对象
        Fiction fiction = new Fiction();
        Magazine magazine = new Magazine();
        TextBook textBook = new TextBook();
        Periodical periodical = new Periodical();

        //测试：
        System.out.println("小说：");
        //这里调用Effect时又调用了父类的Effext方法
        fiction.Effect();
        fiction.ReadingMode();
        System.out.println(fiction.toString());
        //父类的方法
        fiction.FitObject();

        System.out.println("\n杂志：");
        magazine.Effect();
        System.out.println(magazine.toString());

        System.out.println("\n期刊：");
        periodical.Effect();
        System.out.println(periodical.toString());

        System.out.println("\n课本：");
        textBook.Effect();
        textBook.FitObject();
        System.out.println(textBook.toString());
    }
}
