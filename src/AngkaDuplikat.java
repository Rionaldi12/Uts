import java.util.*;

    public class AngkaDuplikat {
        private Map<Integer, Integer> hitungAngka;
        private boolean terDuplikat;

        public AngkaDuplikat() {
            hitungAngka = new HashMap<>();
            terDuplikat = false;
        }

        public void menghitungDuplikat(String input) {
            String[] numbers = input.split(" ");

            for (String number : numbers) {
                int angka = Integer.parseInt(number);
                if (hitungAngka.containsKey(angka)) {
                    int hitung = hitungAngka.get(angka);
                    hitungAngka.put(angka, hitung + 1);
                    terDuplikat = true;
                } else {
                    hitungAngka.put(angka, 1);
                }
            }
        }

        public void tampilkanDuplikat() {
            if (terDuplikat) {
                System.out.println("daftar angka yang sama beserta jumlahnya :");
                for (Map.Entry<Integer, Integer> entry : hitungAngka.entrySet()) {
                    int number = entry.getKey();
                    int count = entry.getValue();
                    if (count > 1) {
                        System.out.println(number + " ada " + count);
                    }
                }
            } else {
                System.out.println("Tidak ada angka yang sama.");
            }
        }
    }

