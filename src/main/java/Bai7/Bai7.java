package Bai7;

public class Bai7 {
    public static void main(String[] args) {
        int i;
        int sum=0;
        for(i=2; i<=100; i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Tổng 50 số chẵn đầu tiên:" +sum);

    }
}
