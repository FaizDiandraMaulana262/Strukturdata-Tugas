import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "", rev = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Input : ");
        text = input.nextLine();
        Stack stack = new Stack(text.length());

        for(int i = 0; i < text.length(); i++){
            stack.push(""+text.charAt(i));
        }

        System.out.print("Reversed : ");
        for(int i = 0; i < text.length(); i++){
            rev = rev + stack.pop();
        }
        System.out.println(rev);
    } 
}
