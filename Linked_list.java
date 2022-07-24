package ObjectOriented;

// public class Linked_list {

    


//     public Node head;

//     class Node{
//         String data;
//         Node next;


//         Node(String data){ 
//             this.data=data;
//             this.next=null;  
//         }
//     }
//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         if (head==null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void PrintList1() {
//         if (head == null) {
//             System.out.println("list is empty");
//             return;
//         }
//         Node currNode = head;
//         while (currNode!=null) {
//             System.out.println(currNode.data + "  ");
//             currNode=currNode.next;
//         }
//     }

//     public static void main(String[] args) {
//         Linked_list list = new Linked_list();
//         list.addFirst("is");
//         list.PrintList1();
//     } 
// }


public class Linked_list {



    public Node head;

    class Node{
        String sdata;
        int idata;
        Node next;


        Node(String data){ 
            this.sdata=data;
            this.idata=0;
            this.next=null;  
        }
        Node(int data){ 
            this.idata=data;
            this.sdata=null;
            this.next=null;  
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void PrintList1() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode!=null) {
            // g=currNode.sdata;
            if (currNode.sdata!=null) {
                System.out.println(currNode.sdata + "  ");
                currNode=currNode.next;
            }
            else{
                System.out.println(currNode.idata + "  ");
                currNode=currNode.next;
            }
        }
    }

    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.addFirst(12);
        list.addFirst("Age is");
        list.PrintList1();
    } 
}

