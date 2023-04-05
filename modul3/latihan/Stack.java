public class Stack{
    int maxSize, top; 
    String[] stackArray;

    public Stack(int s){
        maxSize = s;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String j){
        stackArray[++top] = j;
        System.out.println(top);
    }

    public String pop(){
        return stackArray[--top];
    }

    public String peek(){
        return stackArray[top];
    }

    // public int search(String j){

    // }
    // public void test() {
    //     while()
    // }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize-1;
    }


}