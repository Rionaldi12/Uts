import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan Angka :");
            String input = scanner.nextLine();

            AngkaDuplikat hitung = new AngkaDuplikat();
            hitung.menghitungDuplikat(input);
            hitung.tampilkanDuplikat();
        }
    }

