public class LinkedList{ 
    
    public Node head;
    
    public LinkedList(){
        head = null;
    }

    public int size = 0 ; 

    public void insert(int c){
        //to be completed by the student
        size = size + 1 ;
        Node a = new Node(c) ; 
        if (head != null) {
            a.next = head;
        }
        head = a ;
    }

    public int len(){
        //to be completed by the student
        return size;
    }
}


