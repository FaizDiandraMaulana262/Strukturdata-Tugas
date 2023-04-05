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
    }

    public String pop(){
        return stackArray[--top];
    }

    public String peek(){
        return stackArray[top];
    }

    public int search(String j) {
        int i = 0, a = 0;
        int index = 0;
        for(int x = 0; x < maxSize; x++){
            if(stackArray[x] == j){
                index = x;
                a = 1;
            }
        }

        if(a == 0){
            return -1;
        }

        for(int x = index; x<maxSize; x++){
            if(stackArray[x] != null)
            i = i + 1;
        }
        return i -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return top == maxSize-1;
    }


}