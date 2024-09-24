import java.util.Scanner;

public class PemilihanBIlanganTernaty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String hasil;
        System.out.println("Masukkan angka : ");
        int angka = sc.nextInt();

        if (angka%2==0) {
            hasil="bilangan genap";
        }
        else {
            hasil="bilangan ganjil";
        }
        System.out.println(angka + " merupakan " + hasil);
    }
    
}
