public class kota<E> {
    private E element;

    public kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        kota<Integer> jumlahKota = new kota<Integer>(9);
        kota<String> namaKota = new kota<String>("malang");
        System.out.println("Jumlah kota di jawa timur : " + jumlahKota.getElement()+ " Kota");
        System.out.println("Salah satu kota di jawa timur : Kota "+namaKota.getElement());
    }
}