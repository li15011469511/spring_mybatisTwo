package com.dj.spring_mybatis.controller;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] arr){
        String d = "a b c f c b a e r t";
        String[] a = d.split(" ");
//        Integer[] a = new Integer[]{1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,1,3};
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length;i++){
//            Integer b = a[i];
            String b = a[i];
            Integer c = 0;
            for (int j = 0;j <a.length;j++){
                if (b.equals(a[j])){
                    c++;
                }
            }
//            String s = b.s
            map.put(b,c);
        }
        for (Map.Entry<String,Integer> enter : map.entrySet()){
            System.out.println(enter.getKey() + "：" + enter.getValue());
        }

    }


}
