package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika akmal = new Matematika(6,7);
        
        System.out.println("Hasil penjumlahan: " +akmal.setPenjumlahan());
        System.out.println("Hasil pengurangan: " +akmal.setPengurangan());
        System.out.println("Hasil perkalian: " +akmal.setPerkalian());
        System.out.println("Hasil pembagian: " +akmal.setPembagian());
    }
}
