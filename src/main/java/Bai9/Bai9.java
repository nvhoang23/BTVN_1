package Bai9;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int i,n;
        int value=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = scanner.nextByte();
        for(i=1; i<=n; i++)
        {
            value = value*i;
        }
        System.out.println("Giá trị n! là: " + value);
    }
}
