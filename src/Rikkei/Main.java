package Rikkei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu rong :");
        double with1 = sc.nextDouble();
        System.out.println("nhap chieu dai :");
        double height1 = sc.nextDouble();
        Rectangle rectangle = new Rectangle(with1,height1);
        System.out.println("hinh chu nhat \n" + rectangle.toString());
        System.out.println("chu vi cua hinh chu nhat :" + rectangle.getPerimeter());
        System.out.println("dien tich cua hinh chu nhat :" + rectangle.getArea());
    }
}
