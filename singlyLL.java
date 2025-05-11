import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class singlyLL
{
    Node head;
    void traverseList()
    {
        Node temp=head;
        if(temp==null)
        System.out.println("Empty list");
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    void insertAtFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    int deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Empty list, deletion cannot be performed");
            return 1;
        }
        else
        {
            head=head.next;
            return 0;
        }
    }
    void insertAtLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    int deleteLast()
    {
        if(head==null)
        {
            System.out.println("Empty list, deletion cannot be performed");
            return 1;
        }
        else if(head.next==null)
        {
            return deleteFirst();
        }
        else
        {
            Node temp=head,prev=head;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            return 0;
        }
    }
    void insertAtAny(int data,int pos)
    {
        if(pos==1)
        {
            insertAtFirst(data);
        }
        else
        {
            Node temp=head;
            for(int i=1;i<pos-1 && temp!=null;i++)
            {
                temp=temp.next;
            }
            if(temp!=null)
            {
                Node newNode=new Node(data);
                newNode.next=temp.next;
                temp.next=newNode;
            }
            else
            {
                insertAtFirst(data);
            }
        }
    }
    int deleteAny(int pos)
    {
        if(pos==1)
        {
            return deleteFirst();
        }
        else
        {
            Node temp=head,prev=head;
            for(int i=1;i<pos && temp!=null;i++)
            {
                prev=temp;
                temp=temp.next;
            }
            if(temp==null)
            {
                System.out.println("Element does not exist, deletion cannot be performed");
                return 1;
            }
            else
            {
                prev.next=temp.next;
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        singlyLL ob=new singlyLL();
        int f=1;
        while(f==1)
        {
            System.out.println("\tMENU\n");
            System.out.println("1. Insert a node in the linked list");
            System.out.println("2. Delete a node from the linked list");
            System.out.println("3. Display the entire list\n");
            System.out.print("Enter your choice : ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter the value of the node to be inserted : ");
                int val=sc.nextInt();
                System.out.println("\tMenu\n");
                System.out.println("1. Insert at the beginning");
                System.out.println("2. Insert at any position");
                System.out.println("3. Insert at the end");
                System.out.print("Enter your choice : ");
                int ch1=sc.nextInt();
                switch(ch1)
                {
                    case 1:
                    ob.insertAtFirst(val);
                    System.out.println("Insertion successful");
                    break;
                    case 2:
                    System.out.print("Enter the position in which you want to enter the data : ");
                    int pos=sc.nextInt();
                    ob.insertAtAny(val,pos);
                    System.out.println("Insertion successful");
                    break;
                    case 3:
                    ob.insertAtLast(val);
                    System.out.println("Insertion successful");
                    break;
                    default:
                    System.out.println("Invalid choice");
                }
                break;
                case 2:
                System.out.println("\tMenu\n");
                System.out.println("1. Delete from the beginning");
                System.out.println("2. Delete from any position");
                System.out.println("3. Delete from the end");
                System.out.print("Enter your choice : ");
                int ch2=sc.nextInt();
                switch(ch2)
                {
                    case 1:
                    int res1=ob.deleteFirst();
                    if(res1==0)
                    System.out.println("Deletion successful");
                    break;
                    case 2:
                    System.out.print("Enter the position from which you want to delete the data : ");
                    int pos=sc.nextInt();
                    int res2=ob.deleteAny(pos);
                    if(res2==0)
                    System.out.println("Deletion successful");
                    break;
                    case 3:
                    int res3=ob.deleteLast();
                    if(res3==0)
                    System.out.println("Deletion successful");
                    break;
                    default:
                    System.out.println("Invalid choice");
                }
                break;
                case 3:
                System.out.print("Current list : ");
                ob.traverseList();
                break;
            }
            System.out.print("Enter 1 to continue and 0 to discontinue : ");
            f=sc.nextInt();
        }
    }
}