import java.util.Scanner;

public class PemilihanSwitch09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.println("Masukkan angka pertama: ");
        angka1 = sc.nextDouble();
        System.out.println("Pilih operator (+ - * :)");
        operator = sc.next().charAt(0);
        System.out.println("Masukkan angka kedua: ");
        angka2 = sc.nextDouble();

        switch ((operator)) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case ':':
                hasil = angka1 / angka2;
                break;
            default:
            break;
        }
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}