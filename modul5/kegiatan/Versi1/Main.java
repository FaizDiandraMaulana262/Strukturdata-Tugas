import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);
    BinaryTree sorting = new BinaryTree();

    public void isAdd() {
        System.out.print("Tambahkan Data : ");
        sorting.tambahData(in.nextLine());
    }

    public void isInOrder() {
        sorting.inOrder(sorting.root);
    }

    public void isPostOrder() {
        sorting.postOrder(sorting.root);
    }

    public void isPreOrder() {
        sorting.preOrder(sorting.root);
    }

    public static void main(String[] args) {
        Main mulai = new Main();

        while (true) {
            System.out.print("Pilih Menu \n0. Exit\n1. Add Data\n2. inOrder\n3. postOrder\n4. preOrder\nPilih : ");
            switch (new Main().in.nextInt()) {
                case 0:
                    return;
                case 1:
                    mulai.isAdd();
                    break;
                case 2:
                    mulai.isInOrder();
                    break;
                case 3:
                    mulai.isPostOrder();
                    break;
                case 4:
                    mulai.isPreOrder();
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
        }
    }
}