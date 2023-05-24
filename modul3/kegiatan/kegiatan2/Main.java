import java.util.Scanner;

public class Main {
    public void menu() {
        Queue antrian = new Queue();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "=== Menu Antrian Rumah Sakit ===\n0. Rumah Sakit Tutup\n1. Menambah Pasien (Tambah Antrian)\n2. Memanggil Pasien Untuk Diperiksa\n3. Cek Antrian Paling Atas\n4. Cek Semua Antrian\n5. Cek Status Antrian\n6. Cek Panjang Antrian\n\nPilih Menu : ");
            int pilih = input.nextInt();
            if (pilih == 1) {
                System.out.print("\nMasukan Nama Pasien : ");
                String nama_pasien = input.next();
                if (antrian.offer(nama_pasien)) {
                    System.out.println("Pasien : " + nama_pasien + " Berhasil Ditambahkan Ke Antrian\n");
                } else {
                    System.out.println("Pasien : " + nama_pasien + " Gagal Ditambahkan Ke Antrian\n");
                }
            } else if (pilih == 2) {
                if (antrian.peek() == null) {
                    System.out.println("\nPasien yang Sedang Mengantri Tidak Ada\n");
                } else {
                    String panggilan = antrian.poll();
                    System.out.println("\nMemanggil Pasien " + panggilan + " Untuk diperiksa");
                    System.out.println("Pasien " + panggilan + " diperiksa");
                    System.out.println("Pasien " + panggilan + " Selesai diperiksa\n");
                }
            } else if (pilih == 3) {
                if (antrian.peek() == null) {
                    System.out.println("\nPasien yang Sedang Mengantri Tidak Ada\n");
                } else {
                    System.out.println("\nPasien yang Akan dipanggil Selanjutnya Adalah " + antrian.peek() + "\n");
                }
            } else if (pilih == 4) {
                System.out.println("\nDaftar Antrian : \n");
                antrian.printAll();
            } else if (pilih == 5) {
                if (antrian.isEmpty()) {
                    System.out.println("\nTidak Ada Antrian \n");
                } else {
                    System.out.println("Ada Antrian \n");
                }
            }
            else if (pilih == 6) {
                System.out.println("\nPanjang Antrian : "+antrian.size()+"\n");
            }
            else if (pilih == 7) {
                System.out.println("\nDEbug : "+antrian.debug()+"\n");
            }
            else if (pilih == 0){
                System.out.println("Rumah Sakit Tutup, Datang lagi besok ;D");
                break;
            } else {
                System.out.println("\nMenu Tidak Tersedia\n");
            }
        }
    }

    public static void main(String[] args) {
        new Main().menu();
    }
}
