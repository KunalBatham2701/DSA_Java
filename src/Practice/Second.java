package Practice;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int a,count=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=5;i<=a;i*=5){
            count+=a/i;
        }
        System.out.println(count);
    }
}
