/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diemtrungbinh;

import java.util.Scanner;

public class Diemtrungbinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap diem qua trinh: ");
        float dQT = input.nextFloat();
        System.out.print("Nhap diem thi: ");
        float dT = input.nextFloat();
        float dtb = dQT * 0.4f + dT * 0.6f;
        if (dtb < 4) {
            System.out.println("\nF");
        } else if (dtb < 5.5) {
            System.out.println("\nD");
        } else if (dtb < 7) {
            System.out.println("\nC");
        } else if (dtb < 8.5) {
            System.out.println("\nB");
        } else {
            System.out.println("\nA");
        }
        input.close();
    }
}
