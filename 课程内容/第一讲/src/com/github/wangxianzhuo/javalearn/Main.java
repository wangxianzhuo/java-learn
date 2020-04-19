package com.github.wangxianzhuo.javalearn;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);

        Rectangle rectangle1 = new Rectangle(10, 10);
        Rectangle rectangle2 = new Rectangle(5, 6);
        System.out.println("矩形1的面积是"+rectangle1.getArea()+"，周长是"+rectangle1.getCircumference());
        System.out.println("矩形2的面积是"+rectangle2.getArea()+"，周长是"+rectangle2.getCircumference());
        
        Score score = new Score();
        System.out.println("100分的等级是："+score.getGradeLevel(100));
        System.out.println("95.5分的等级是："+score.getGradeLevel(95.5));
        System.out.println("88分的等级是："+score.getGradeLevel(88));
        System.out.println("72分的等级是："+score.getGradeLevel(72));
        System.out.println("68.5分的等级是："+score.getGradeLevel(68.5));
        System.out.println("60分的等级是："+score.getGradeLevel(60));
        System.out.println("59.5分的等级是："+score.getGradeLevel(59.5));
    }
}
