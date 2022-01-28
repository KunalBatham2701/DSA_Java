package Practice;

import java.util.Scanner;

public class Lexicographical {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the last no. : ");
        a=sc.nextInt();
        lexic(0,a);
    }
    public static void lexic(int start,int end){
        if(start>end)
            return;
        if(start!=0)
            System.out.println(start);
        int i=0;
        if(start==0)
            i=1;
        while(i<10){
            lexic(start*10+i,end);
            i++;
        }
    }
}
