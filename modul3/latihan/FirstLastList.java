public class FirstLastList {
    public Link first, last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean add(String dd) {
        Link newLink = new Link(dd);
        try {
            if (isEmpty()) {
                first = newLink;
            } else {
                last.next = newLink;
            }
            last = newLink;
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean offer(String dd) {
        Link newLink = new Link(dd);
        try {
            if (isEmpty()) {
                first = newLink;
            } else {
                last.next = newLink;
            }
            last = newLink;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String poll() {
        String temp = first.dData;
        if (first == null)
            return null;

        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public String remove() {
        String temp = first.dData;
        try {
            if (first.next == null) {
                last = null;
            }
            first = first.next;

            return temp;
        } catch (Exception e) {
            System.out.println(e);
            return "" + e;
        }
    }

    public String element(){
        if(isEmpty()){
            return null;
        }
        else{
            return first.dData;
        }
    }

    public String peek(){
        try {
            return first.dData;
        } catch (Exception e) {
            return ""+e;
        }
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
