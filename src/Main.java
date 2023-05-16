import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan daftar angka :");
            String input = scanner.nextLine();

            AngkaDuplikat counter = new AngkaDuplikat();
            counter.menghitungDuplikat(input);
            counter.tampilkanDuplikat();
        }
    }

