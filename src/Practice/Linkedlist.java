package Practice;

import java.util.Scanner;

import static java.lang.System.exit;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class SinglyLinkedList{
    Node head;
    public void insertAtLast(Node newnode){
        if(head==null){
            head=newnode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void deletefrombeginning(){
        if(head==null){
            System.out.println("empty Linked list");
        }
        else{
            head=head.next;
        }
    }
    public void deletefromlast(){
        if(head==null){
            System.out.println("empty Linked list");
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void deletefromPosition(int p){
        if(head==null){
            System.out.println("empty Linked list");
        }
        if(p==1){
            head=head.next;
        }
        else{
            Node temp=head;
            for(int i=1;i<p-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("empty linked list");
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public void insertAtBeginning(Node newnode){
        newnode.next=head;
        head=newnode;
    }
    public void insertAtPosition(int p,Node newnode){
        if(p==1 || head==null){
            newnode.next=head;
            head=newnode;
        }
        else{
            int length=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                length++;
            }
            if(p>length+1)
                insertAtLast(newnode);
            else {
                temp=head;
                for (int i = 1; i < p - 1; i++) {
                    temp = temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
    }
}
public class Linkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node n1;
        SinglyLinkedList l=new SinglyLinkedList();
        char ch;
        int a,p;
        do {
            System.out.print("\nMain : \n1.Insert New Node at Beginning \n2.Insert New Node at Last \n3.Insert New Node at Position P \n4.Delete Node from Begininning \n5.Delete Node from Last \n6.Delete Node of Position P \n7.Display the List \n8.Exit \n\nEnter your choice here : ");
            a=sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.print("\nenter the no. : ");
                    n1 = new Node(sc.nextInt());
                    l.insertAtBeginning(n1);
                }
                case 2 -> {
                    System.out.print("\nenter the no. : ");
                    n1 = new Node(sc.nextInt());
                    l.insertAtLast(n1);
                }
                case 3 -> {
                    System.out.print("\nenter the no. : ");
                    n1 = new Node(sc.nextInt());
                    System.out.print("\nenter the position : ");
                    p = sc.nextInt();
                    l.insertAtPosition(p, n1);
                }
                case 4 -> l.deletefrombeginning();
                case 5 -> l.deletefromlast();
                case 6 -> {
                    System.out.print("\nenter the position : ");
                    p = sc.nextInt();
                    l.deletefromPosition(p);
                }
                case 7 -> l.display();
                case 8 -> exit(0);
                default -> System.out.println("Please enter valid no. ");
            }
            System.out.print("\ndo you want to continue y/n : ");
            ch=sc.next().charAt(0);

        }while(ch=='y' || ch=='Y');
    }
}
