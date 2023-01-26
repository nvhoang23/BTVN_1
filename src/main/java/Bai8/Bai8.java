package Bai8;

public class Bai8 {
    public static void main(String[] args) {
        int i;
        int sum=0;
        for(i=5; i<=100; i++)
        {
            if(i%5==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Tổng của dãy số chia hết cho 5 là:" +sum);
    }
}
