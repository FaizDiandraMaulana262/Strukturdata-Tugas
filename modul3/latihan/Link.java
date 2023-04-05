public class Link {
    String dData;
    Link next;

    public Link(String data){
        this.dData = data;
    }

    public void displayLink(){
        System.out.println(dData+" ");
    }
}
