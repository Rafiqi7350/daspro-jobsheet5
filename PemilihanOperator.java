import java.util.Scanner;

public class PemilihanOperator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan operator (+, -, *, :): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();
        
            if (operator == '+') {
                System.out.println("Hasil: " + (angka1 + angka2));
            } else if (operator == '-') {
                System.out.println("Hasil: " + (angka1 - angka2));
            } else if (operator == '*') {
                System.out.println("Hasil: " + (angka1 * angka2));
            } else if (operator == ':') {
                System.out.println("Hasil: " + (angka1 / angka2));
            } else {
                System.out.println("Operator yang dipilih tidak sesuai");
                }
            
                }
            }
         
