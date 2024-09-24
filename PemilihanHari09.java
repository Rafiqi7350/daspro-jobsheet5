import java.util.Scanner;

public class PemilihanHari09 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;
        System.out.println("Masukkan Nama Hari: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "senin":  
            case "selasa":
            case "rabu":
            case "kamis":
            case "jumat":
                dayType = "weekday";
                break;
            case "sabtu":
            case "minggu":
                dayType = "weekend";
                break;
            default:
                dayType = "bukan nama hari";
        }
        System.out.println(dayName + " adalah " + dayType);
    }
}