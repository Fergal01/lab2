/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ptb2;

/**
 *
 * @author vanti
 */
import java.util.Scanner;

public class Ptb2 {
    public static void main(String[] args) {
        float a, b, c, D, x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap cac so a, b, c:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh VSN");
                } else {
                    System.out.println("Phuong trinh VN");
                }
            } else {
                x1 = (-c) / b;
                System.out.printf("Phuong trinh co nghiem x = %.2f", x1);
            }
        } else {
            D = b * b - 4 * a * c;
            if (D < 0) {
                System.out.println("Phuong trinh VN");
            } else if (D == 0) {
                x1 = (-b) / (2 * a);
                System.out.printf("Phuong trinh co nghiem kep: x = %.2f", x1);
            } else {
                x1 = (-b + (float) Math.sqrt(D)) / (2 * a);
                x2 = (-b - (float) Math.sqrt(D)) / (2 * a);
                System.out.printf("Phuong trinh co 2 ngiem phan biet: x1 = %.2f\tx2 = %.2f", x1, x2);
            }
        }
        sc.close();
    }
}

