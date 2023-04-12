public class Stack{
    int top, size;
    String[] stack;

    public Stack(int size){
        this.size = size;
        stack = new String[this.size];
        top = -1;
    }

    public boolean empty(){
        return top == -1;
    }

    public String peek(){
        return stack[top];
    }

    public String pop(){
        String tmp = stack[top];
        top = top - 1;
        return tmp;
    }

    public void push(String element){
        top = top + 1;
        stack[top] = element;
    }

    public int search(String element){
        int i = 1;
        for (String string : stack) {
            if(string == element){
                break;
            }
            i+=1;
        }

        return i;
    }
}