import java.util.Scanner;

public class PemilihanBilangan09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Angka : ");
        int angka = sc.nextInt();
    
        if (angka % 2 == 0) 
        {
            System.out.println("Angka " + angka + " merupakan bilangan genap");  
        }
        else
        {
            System.out.println("Angka " + angka + " merupakan bilangan ganjil");
        }
    }

    
} 