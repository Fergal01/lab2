/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sochinhphuong;

/**
 *
 * @author vanti
 */ import java.util.Scanner;
public class Sochinhphuong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so n bat ky: ");
        int n = input.nextInt();
        int sqr = (int) Math.sqrt(n);
        if (sqr * sqr == n) {
            System.out.printf("\n%d la so chinh phuong", n);
        } else {
            System.out.printf("\n%d khong phai la so chinh phuong", n);
        }
        input.close();
    }
}


