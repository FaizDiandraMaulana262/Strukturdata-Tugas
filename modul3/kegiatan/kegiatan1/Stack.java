public class Stack {
    public Node top;

    public boolean empty(){
        if(top == null){
            return true;
        }
        else{
            return false;
        }
    }

    public String peek(){
        Node current = top;
        while(!(current.next == null)){
            current = current.next;
            String value = current.value;
            if(current.next == null){
                return value;
            }
        }
        return null;
    }

    public Node pop(){
        return top;
    }

    public void push(String element){   
        if(top == null){
            top = new Node(element);
            top.next = null;
        }

        Node current = top;
        while (!(current.next == null)) {
            current = current.next;
        }

        current.next = new Node(element);
    }

    public int search(String element){
        Node current = top;
        int i = 0;
        while(!(current.next == null)){
            current = current.next;
            String test = current.value;
            if(test == element){
                while(!(current.next == null)){
                    i = i + 1;
                    current = current.next;
                }
                return i;
            }
        }
        i = -1;
        return i;
    }

    // public void debug(){
    //     Node current = top;
    //     while(!(current.next == null)){
    //         current = current.next;
    //         String value = current.value;
    //         if(current.next == null){
    //             value = null;
    //         }
    //     }
    // }

    // public int debug2(){
    //     Node current = top;
    //     int i = 0;
    //     while(!(current.next == null)){
    //         current = current.next;
    //         String test = current.value;
    //         if(test == "test"){
    //             while(!(current.next == null)){
    //                 i = i + 1;
    //                 current = current.next;
    //             }
    //             return i;
    //         }
    //     }
    //     i = -1;
    //     return i;
    // }
}
