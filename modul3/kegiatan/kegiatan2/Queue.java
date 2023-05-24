public class Queue {
    Node first = null, last = null;

    public boolean add(String element) {
        Node newLink = new Node(element);
        try {
            if (first == null) {
                first = newLink;
            } else {
                last.next = newLink;
            }
            last = newLink;
        } catch (Exception e) {
            System.out.println(e);
        }

        Node current = first;
        String currentData = "";
        while (!(current == null)) {
            currentData = current.data;
            current = current.next;
        }

        if (currentData == element) {
            return true;
        } else {
            return false;
        }
    }

    //queue
    public boolean offer(String element) {
        Node newLink = new Node(element);
        try {
            if (first == null) {
                first = newLink;
            } else {
                last.next = newLink;
            }
            last = newLink;
        } catch (Exception e) {
            System.out.println(e);
        }

        Node current = first;
        String currentData = "";
        while ((current != null)) {
            currentData = current.data;
            current = current.next;
        }

        if (currentData == element) {
            return true;
        } else {
            return false;
        }
    }

    public String element() {
        // Node current = first;
        // String currentData = "";
        // while (!(current == null)) {
        //     currentData = current.data;
        //     current = current.next;
        // }
        // if (currentData == "") {
        //     return null;
        // }
        // return currentData;
        if(first == null){
            return null;
        }
        return first.data;
    }

    public String peek() {
        // Node current = first;
        // String currentData = "";
        // while (!(current == null)) {
        // currentData = current.data;
        // current = current.next;
        // }
        // if(currentData == ""){
        // return null;
        // }
        if(first == null){
            return null;
        }
        return first.data;
    }

    // dequeue
    public String poll() {
        // int x = 0, y = 0;
        // Node current = first;
        // String currentData = "";
        // while (!(current == null)) {
        // x = x + 1;
        // current = current.next;
        // }

        // current = first;
        // while (!(current == null)) {
        // y = y + 1;
        // currentData = current.data;
        // if(y == (x - 1)){
        // current.next = null;
        // }
        // current = current.next;
        // }
        // if(currentData == ""){
        // return null;
        // }
        // return currentData;

        // if(currentData == ""){
        // return null;
        // }

        if (last == null) {
            return null;
        }
        Node p, tmp = first.next;
        while(tmp != null){
            p = tmp;
        }
        
        String currentData = first.data;
        last = null;
        last = tmp;
        return currentData;
    }

    public String debug() {

        if (first == null) {
            return null;
        }
        String currentData = last.data;
        last = null;
        return currentData;
    }

    public String remove() {
        // int x = 0, y = 0;
        // Node current = first;
        // String currentData = "";
        // while (!(current == null)) {
        //     x = x + 1;
        //     current = current.next;
        // }

        // current = first;
        // while (!(current == null)) {
        //     y = y + 1;
        //     currentData = current.data;
        //     if (y == (x - 1)) {
        //         current.next = null;
        //     }
        //     current = current.next;
        // }
        // return currentData;
        if (first == null) {
            return null;
        }
        Node tmp = first.next;
        String currentData = first.data;
        first = null;
        first = tmp;
        return currentData;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public void printAll() {
        Node current = first;
        while (!(current == null)) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size() {
        int x = 0;
        Node current = first;
        while (!(current == null)) {
            x++;
            System.out.println(current.data);
            current = current.next;
        }
        return x;
    }
}
