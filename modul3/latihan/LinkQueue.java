public class LinkQueue {
    public FirstLastList theList;

    public LinkQueue(){
        theList = new FirstLastList();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void add(String j){
        theList.add(j);
    }

    public void offer(String j){
        theList.offer(j);
    }

    public String remove(){
        return theList.remove();
    }

    public String poll(){
        return theList.poll();
    }

    public String element(){
        return theList.element();
    }

    public String peek(){
        return theList.peek();
    }

    public void displayQueue(){
        System.out.println("Queue (Head --> Tail) : ");
        theList.displayList();
    }
}
