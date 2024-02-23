public class Polynomial extends LinkedList{  
    public Polynomial add(Polynomial p){
        //to be implemented by the student
        int n = len() ;
        int m = p.len() ;
        if(m == n){
            LinkedList l = new LinkedList() ;
            while(head != null){
                int c = head.data + p.head.data ;
                l.insert(c);
                head = head.next ;
                p.head = p.head.next ;
            }
            LinkedList l1 = new LinkedList() ;
            while(l.head != null){
                l1.insert(l.head.data);
                l.head = l.head.next ;
            }
            return l1;
        }
        else if (n > m) {
            LinkedList l = new LinkedList() ;
            while(p.head != null){
                int c = p.head.data + head.data ;
                head = head.next ;
                p.head = p.head.next ;
            }
            while (head != null){
                int c = head.data ;
                l.insert(c) ;
                head = head.next ;
            }

            LinkedList l1 = new LinkedList() ;
            while(l.head != null){
                l1.insert(l.head.data);
                l.head = l.head.next ;
            }
            return l1;
        }
        else if (m > n) {
            LinkedList l = new LinkedList() ;
            while(head != null){
                int c = p.head.data + head.data ;
                head = head.next ;
                p.head = p.head.next ;
            }
            while (p.head != null){
                int c = p.head.data ;
                l.insert(c) ;
                p.head = p.head.next ;
            }

            LinkedList l1 = new LinkedList() ;
            while(l.head != null){
                l1.insert(l.head.data);
                l.head = l.head.next ;
            }
            return l1;
        }
        return null;
    }

    public Polynomial mult(Polynomial p){
        //to be implemented by the student
        Node a = head ;
        Node b = p.head ;
        LinkedList l = new LinkedList() ;
        Node c = l.head ;
        c.data = 0 ; 
        while(a != null){
            while (b != null){
                c.data = a.data*b.data + c.data ;
                b = b.next ;
                if(b != null){
                    c = c.next ;
                }
            }
            a = a.next ;
            b = p.head ;
        }
        LinkedList l1 = new LinkedList() ;
        while(l.head != null){
            l1.insert(l.head.data);
            l.head = l.head.next ;
        }
        return l1;
    }
}   