package Versi2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Struktural struktural = new Struktural();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\n=== Pilih Menu ===\n0. Exit\n1. Add Data\n2. Inorder\n3. Preorder\n4. Postorder\n\nPilih Menu : ");
        switch (input.nextInt()) {
            case 0:
                return;
            case 1:
                System.out.print("\nNama Struktural : ");
                String nama = input.next();
                System.out.print("Priority : ");
                int angka = input.nextInt();

                struktural.isAddData(nama, angka);
                break;
            case 2:
                System.out.println("\nInorder : ");
                struktural.isInOrder(struktural.root);
                break;
            case 3:
                System.out.println("\nPreorder : ");
                struktural.isPreOrder(struktural.root);
                break;
            case 4:
                System.out.println("\nPostorder : ");
                struktural.isPostOrder(struktural.root);
                break;
            default:
                System.out.println("\nMenu Tidak Tersedia");
                break;
        }
        }
    }
}
