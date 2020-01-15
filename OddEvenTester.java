
public class OddEvenTester {

    public static void main(String[] args) 
    {
       int angka;
       perhitungan(20);
    }
    
    public static String perhitungan(int nilai){
        String pesan="", jumlah="";

        if (nilai>2) {
            jumlah = " Lebih besar dari 2";
            if(nilai%2 == 0){
                pesan = "Bilangan Genap";
            }else{
                pesan = "Bilangan Ganjil";
            }
        }
        else{
            jumlah = "Lebih Kecil dari 2";
        }
        System.out.println(pesan + jumlah);
        return pesan;
    }
    
}
