package LINKEDLIST;

class Node{
    int data;
    String name;

    Node next;

    Node(int data, String name){
        this.data = data;
        this.name = name;

        this.next = null;
    }
}
public class LinkedList {
    // printing LL using Recursion 
    
    public static void printListRec(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+ "-->");
        printListRec(head.next);
    } 
    //printing LL function.
    // public static void printList(Node head){
    //     while(head != null){
    //         System.out.print(head.data+"->");
    //         head = head.next;
    //     }
    // }

    static Node insertInBeg(Node head, int data, String name){
        Node temp = new Node(data, name);
        temp.next = head;
        head = temp;

        return head;
    }
    static Node insertIntoList(Node head, int data, String name){
        Node temp = new Node(data, name);

        if(head==null){
            head = temp;
            return head;
        }
        else{
            while(head.next != null){
                head = head.next;
            }
            head.next = temp;
        }
        return head;
    }
    static Node insertAfter(Node head,int nodeAfter,int data, String name){
        Node temp = new Node(data, name);

        // if(head == null){
        //     System.out.println("Node cant be inserted as L.L dosent exist");
        //     return head;
        // }
        // else{
        while(head.data != nodeAfter){
                head = head.next;
                // if(head == null){
                //     System.out.println("Node cant be Inserted");
                //     return head;
                // }
            }
            
            temp.next = head.next;
            head.next = temp;
            return head;
        }
        static Node insertAtK(Node head, int k, int data, String name){
            Node temp = new Node(data, name);
            // while(i<k){
            //     i++;
            //     head = head.next;
            // }
            while(k>2){
                k--;
                head = head.next;
            }
            temp.next = head.next;
            head.next = temp;

            return head;
        }
        // static int length(Node head){
        //     int count=0;
        //     while(head != null){
        //         head = head.next;
        //         count++;
        //     }
        //     return count;
        // }
        static void insertAtKfromEnd(Node head, int k, int data, String name){
            Node n = head;
            int length = 0;
            while(n != null){
                n = n.next;
                length++;
            }
            k = length-k+2;
            insertAtK(head, k, data, name);

            // Node temp = new Node(data, name);
            // while(k>1){
            //     head = head.next;
            //     k--;
            // }
            // temp.next = head.next;
            // head.next = temp;
            // return head;
        }

    static Node deleteAtK(Node head, int k, String name){
        Node temp = head;
        Node cn = head;
        if(k==1){
            head = head.next;
            cn.next = null;
            cn = null;
            return head;
        }
        cn = cn.next;
        k--;

         
        while(k>1){
            temp = temp.next;
            cn = cn.next;
            k--;
        }
        temp.next = cn.next;
        cn.next = null;
        cn = null;
        return head;
    }

     
        
         
     
    public static void main(String[] args) {

        // Node head = new Node(10, "headNode");
        // Node second = new Node(20, "2nd");
        // Node third = new Node(27, "3rd");
        // Node fourth = new Node(40, "4th"); 

        Node head = null;
        head = insertIntoList(head, 10, "abc");
        insertIntoList(head, 20, "def");
        insertIntoList(head, 30, "ghi");
        insertIntoList(head, 40, "jkl");
        insertIntoList(head, 50, "mno"); 
        head = insertInBeg(head, 5, "xyz");
        head = insertInBeg(head, 80, "pqr");
        insertAfter(head, 30, 35, "sss");
        insertAfter(head, 10, 90, "sss");
        insertAtK(head, 4, 55, "MrA");
        insertAtK(head, 8, 100, "pubg");
        insertAtKfromEnd(head, 2, 58, "end");
        head = deleteAtK(head, 6, "shr");
         


        // head.next = second;
        // second.next = third;
        // third.next = fourth;

        //No effect if we null 2nd, 3rd, or 4th node
        // second = null;
        // third = null;
        // fourth = null;


        // System.out.println(head.data+"->"+head.next.data+"->"+head.next.next.data+"->"
        // +head.next.next.next.data);

        // function to print LinkedList
        // printList(head);

        //function to print LL using recursion
        printListRec(head);
         
        
    }
    
}
