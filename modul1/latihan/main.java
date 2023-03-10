import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<konsumsi> listKonsumsis = new ArrayList<>();
        konsumsi<makanan, minuman> breakfast = new konsumsi<>();
        konsumsi<makanan, minuman> lunch = new konsumsi<>();

        makanan roti = new makanan();
        roti.setNamaHidangan("Roti Tawar");
        minuman susu = new minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsum(roti, susu);
        listKonsumsis.add(breakfast);

        makanan nasi = new makanan();
        nasi.setNamaHidangan("Nasi Putih");
        minuman air = new minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsum(nasi, air);
        listKonsumsis.add(lunch);

        System.out.println("Menu Konsunsi");
        for(konsumsi<makanan, minuman>konsumsi: listKonsumsis){
            makanan makanan = konsumsi.testM();
            minuman minuman = konsumsi.testI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }

    }
}
