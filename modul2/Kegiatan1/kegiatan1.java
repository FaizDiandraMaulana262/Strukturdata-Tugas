import java.util.ArrayList;
import java.util.Collections;
public class kegiatan1<E>{

    public void printCountSame(E hewan, E jumlah){
        System.out.println("Jumlah "+hewan+" Dalam Array Adalah : "+jumlah);
    }

    public void printIndex(E index){
        System.out.println("Posisi Index : "+index);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayHewan = new ArrayList<String>();
        ArrayList<Integer> arrayNum = new ArrayList<>();
        kegiatan1<String> tampilBebek = new kegiatan1<String>();

        // Ketentuan
        arrayHewan.add(0, "Angsa");
        arrayHewan.add(1, "Bebek");
        arrayHewan.add(2, "Cicak");
        arrayHewan.add(3, "Domba");
        arrayHewan.add(4, "Elang");
        arrayHewan.add(5, "Gajah");

        // Menambah hewan
        arrayHewan.add("Badak");
        arrayHewan.add("Bebek");

        String hewanYangDicari = "Bebek";
        int count = Collections.frequency(arrayHewan, hewanYangDicari);
        String indexKosong= "";
        for(int x = 1; x <= arrayHewan.size(); x++){
            if(arrayHewan.get(x - 1) == hewanYangDicari){
                indexKosong = indexKosong + (x - 1) + " ";
            }
        }

        System.out.println("Output : \n"+arrayHewan);
        System.out.println("Hewan Yang Dicari : " + hewanYangDicari);
        // Tampilkan Jumlah
        tampilBebek.printCountSame(hewanYangDicari , " "+count);
        // Tampilkan Index
        tampilBebek.printIndex(indexKosong);

        //Remove
        arrayHewan.remove(hewanYangDicari);
        System.out.println("\nOutput : \n"+arrayHewan);

        //Tampilkan index 0 dan 2
        System.out.println("\nOutput : \nIndex ke-0 : "+arrayHewan.get(0)+"\nIndex ke-2 : "+arrayHewan.get(2));
        //Remove index 0
        arrayHewan.remove(0);
        System.out.println(arrayHewan);

        //Ubah index 0 menjadi ular
        arrayHewan.set(0, "Ular");
        System.out.println("\nOutput : \n"+arrayHewan);
        //Menambah itik index ke 2
        arrayHewan.add(2, "Itik");
        System.out.println(arrayHewan);

        //Remove diantara index 1 sampai 5
        // arrayHewan.removeRange(1, 5);
        // arrayHewan.removeIf(true);
        for(int x = 0; x < arrayHewan.size() - 1; x++){
            if(x > 1 && x < 5){
                arrayNum.add(x);
            }
        }
        int i = 0;
        for (Integer index : arrayNum) {
            int x = index;
            arrayHewan.remove(x - i);
            i=i+1;
        }
        System.out.println("\nOutput : \n"+arrayHewan);

        // Index pertama dan terakhir
        System.out.println("\nOutput : \nElement Pertama : "+arrayHewan.get(0)+"\nElement Terakhir : "+arrayHewan.get((arrayHewan.size()-1)));

        // Menampilkan panjang Element
        System.out.println("\nOutput : \nJumlah Element : "+arrayHewan.size());

        //Menampilkan index dari badak
        System.out.println("\nOutput : \nIndex dari Badak : "+arrayHewan.indexOf("Badak"));
    }
}