import java.util.Arrays;

public class LinkedList {
    Node head;
    public void add(int data){
        if(head == null){
            head = new Node(data);
            head.prev = null;
        }

        Node test = head;
        while (!(test.next == null)) {
            test = test.next;
        }

        test.next = new Node(data);
    }

    public void printList(){
        Node current = head, tests = head;
        int i = 0, x = 0;
        System.out.print("Before :");
        while(!(current.next == null)){
            current = current.next;
            int test = current.data;
            System.out.print(" "+test);
            i = i + 1;
        }
        
        System.out.print("\nAfter :");
        Integer[] arrNum = new Integer[i];
        while(!(tests.next == null)){
            tests = tests.next;
            arrNum[x] = tests.data;
            x = x + 1;
        }

        Arrays.sort(arrNum);
        for (Integer integer : arrNum) {
            System.out.print(" "+integer);
        }
    }
}
