package Bai10;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int n=scan.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            temp=n%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.print(n + " Là số nguyên tố!");
        else
            System.out.print(n + " Không phải là số nguyên tố!");
    }
}
