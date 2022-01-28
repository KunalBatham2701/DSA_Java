package Practice;

import java.util.Scanner;

public class Third {
    public static int[] res(int input[],int start,int x){
        if (start == input.length) {
            int[] ans = new int[0];
            return ans;
        }
        int[] smallIndex = res(input, start+1,x);
        if (input[start] == x) {
            int[] myAns = new int[smallIndex.length + 1];
            myAns[0] = start;
            for (int i = 0; i < smallIndex.length; i++) {
                myAns[i + 1] = smallIndex[i];
            }
            return myAns;
        }
        else {
            return smallIndex;
        }
        
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array : ");
        a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the array ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no. to be searched : ");
        b=sc.nextInt();
        int arr2[]=res(arr,0,b);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+1+" ");
        }
    }
}
