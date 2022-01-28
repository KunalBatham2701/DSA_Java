package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int[] arr=new int[a];
        for(var i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(var i=0;i<a-1;i++){
            if(arr[i+1]==arr[i])
                continue;
            else
                System.out.print(arr[i]+" ");
        }
        System.out.println(arr[a-1]);
//        ArrayList<Integer> obj=new ArrayList<>();
//        int a;
//        while((a=sc.nextInt())==a){
//            System.out.println(a);
//        }
//        while(sc.nextInt()!='\n'){
//            obj.add(sc.nextInt());
//        }
//        for(int i:obj)
//            System.out.println(i);
    }
}
