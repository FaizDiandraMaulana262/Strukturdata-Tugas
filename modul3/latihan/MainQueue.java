public class MainQueue {
    public void queueExample(){
        LinkQueue queue = new LinkQueue();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("Remove : "+queue.remove());
        System.out.println("Element : "+queue.element());
        System.out.println("Poll : "+queue.poll());
        System.out.println("Peek : "+queue.peek());
        queue.displayQueue();
    }
    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}
