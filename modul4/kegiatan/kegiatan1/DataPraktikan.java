package kegiatan1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataPraktikan {
    public HashMap<String, String> tabelData = new HashMap<>();

    boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (tabelData.get("nimPraktikan") == null) {
            if (nimPraktikan.charAt(0) == 'I' && nimPraktikan.charAt(1) == 'F') {

                tabelData.put(nimPraktikan, namaAsisten);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    void tampil() {
        for (Map.Entry<String, String> entry : tabelData.entrySet()) {
            System.out.println("Nim Praktikan : " + entry.getKey() + "\nNama Asisten : " + entry.getValue() + "\n\n");
        }
    }

    void listNimPraktikan() {
        for (Map.Entry<String, String> entry : tabelData.entrySet()) {
            System.out.println("Nim Praktikan : " + entry.getKey() + "\n");
        }
    }

    void listNamaAsisten() {
        for (Map.Entry<String, String> entry : tabelData.entrySet()) {
            System.out.println("Nama Asisten : " + entry.getValue() + "\n");
        }
    }

    int totalEmail() {
        return tabelData.size();
    }

    boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (tabelData.get(nimPraktikan) == null) {
            return false;
        } else {
            tabelData.remove(nimPraktikan);
            return true;
        }
    }

    void editData(String nimPraktikan, String namaAsisten) {
        if (tabelData.get(nimPraktikan) == null) {
            System.out.println("Data Tidak Ditemukan");
        } else {
            tabelData.put(nimPraktikan, namaAsisten);
            System.out.println("Data Berhasil Diubah : \nNim Praktikan : " + nimPraktikan + "\nNama Praktikan : "
                    + tabelData.get(nimPraktikan));
        }

    }

    public static void main(String[] args) {
        DataPraktikan praktikan = new DataPraktikan();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "=== Menu ===\n1. Tambah Data\n2. Tampilkan Data\n3. Tampilkan Nim Praktikan\n4. Tampilkan Nama Asisten\n5. Total Data\n6. Hapus Data\n7. Edit Data\n\nPilihi Menu : ");
            int i = input.nextInt();

            if (i == 1) {
                System.out.print("\nTambahkan Data : \nNim Mahasiswa : ");
                String nim = input.next();
                System.out.print("Nama Asisten : ");
                String asisten = input.next();
                if (praktikan.tambahData(nim, asisten)) {
                    System.out.println("\nData Berhasil Ditambah");
                } else {
                    System.out.println("\nData Gagal Ditambah");
                }
            }

            if (i == 2) {
                praktikan.tampil();
            }

            if (i == 3) {
                praktikan.listNimPraktikan();
            }

            if (i == 4) {
                praktikan.listNimPraktikan();
            }

            if (i == 5) {
                System.out.println("\nTotal Data : " + praktikan.totalEmail());
            }

            if (i == 6) {
                System.out.print("\nHapus Data\nMasukan Nim Praktikan : ");
                String nim = input.next();
                System.out.print("Masukan Nama Asisten : ");
                String asisten = input.next();
                if (praktikan.hapusData(nim, asisten)) {
                    System.out.println("\nData Berhasil Dihapus");
                } else {
                    System.out.println("\nData Gagal Dihapus");
                }
            }

            if (i == 7) {
                System.out.print("\nEdit Data\nMasukan Nim Praktikan : ");
                String nim = input.next();
                System.out.print("Masukan Nama Asisten : ");
                String asisten = input.next();
                praktikan.editData(nim, asisten);
            }
        }
    }
}