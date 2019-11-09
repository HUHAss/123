package com.classbook.chapter.seven;

import java.util.*;

public class Manager {

    public static void main(String[] args) {
        User user1 = new User("aaa", "123456");
        User user2 = new User("bbb", "654321");

        List list = new ArrayList();

        list.add(user1);
        list.add(user2);

        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());

        System.out.println("-----------------");

        List list1 = new LinkedList();

        list1.add(user1);
        list1.add(user2);

        System.out.println(list1.get(0).toString());
        System.out.println(list1.get(1).toString());

        System.out.println("-----------------");

        Map<String,User> map = new HashMap<>();
        map.put("001",user1);
        map.put("002",user2);

        System.out.println(map.get("002").toString());

        System.out.println("-----------------");

        Map<String,String> map1 = new HashMap<>();
        map1.put("003","121212");
        System.out.println(map1.get("003"));
    }
}

