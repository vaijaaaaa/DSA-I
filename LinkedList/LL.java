public class LL {

    class Node {
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next =null;
        }
    }

    //Adding element at the first of LL (Head)

    private Node head;
    public void addFist(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Adding element at the last of LL (tail)

    public void addList(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }


    //printing the LinkedList
    public void printList(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");

    }



    public static void main(String[] args) {
        LL list = new LL();
        list.addFist("hello");
        list.addFist("this");
        list.printList();
        
        list.addList("Linked List");
        list.printList();
    }
}
