//circular queue by array
package Practice;
import java.util.*;
class CircularQueueArray{
    int arr[],size,front,rear;
    public CircularQueueArray(int size){
        arr=new int[size];
        this.size=size;
        front=rear=-1;

    }
    public Boolean isempty(){
        if(front==-1)
            return true;
        else
            return false;
    }
    public Boolean isfull(){
        if(rear+1==front)
            return true;
        else if(front==0 && rear==size-1)
            return true;
        else
            return false;
    }
    public void enqueue(int a){
        if(isempty()){
            front=rear=0;
            arr[rear]=a;
        }
        else if(isfull()){
            System.out.println("queue is full");
        }
        else{
            if(rear+1==size && front!=0)
                rear=0;
            else
                rear++;
            arr[rear]=a;
        }
    }
    public void dequeue(){
        if(isempty()){
            System.out.println("queue is empty");
        }
        else if(front==rear){
            front=rear=-1;
        }
        else if(front==size-1){
            front=0;
        }
        else{
            System.out.print("\ndeleted value is : "+arr[front]);
            arr[front]=0;
            front++;
        }
    }
    public void display(){
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class CircularQueueByArray {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array : ");
        size=sc.nextInt();
        CircularQueueArray obj=new CircularQueueArray(size);
        for(int i=0;i<size-1;i++) {
            obj.enqueue(sc.nextInt());
        }
        obj.display();
        obj.dequeue();
        obj.display();
        obj.dequeue();
        obj.display();
        System.out.println("\nenter 6 more values");
        for(int i=0;i<6;i++){
            obj.enqueue(sc.nextInt());
        }
        obj.display();
    }
}
