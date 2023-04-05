public class Index {
    public static void main(String[] args) {
        Stack test = new Stack();
        test.push("null");
        test.push("idk");
        test.push("iafaifgaifa");
        test.push("test");
        test.push("iafaifgaifa");
        test.push("idk");
        test.push("idk");
        System.out.println(test.peek());
        System.out.println(test.empty()+"\n");
        System.out.println(test.search("idk"));
    }
}
