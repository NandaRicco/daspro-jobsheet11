import java.util.Scanner;

public class Cafe {

    static int[][] penjualan = new int[5][7];
    static String[] menu = { "Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan" };

    public static void inputData() {
        Scanner cfe = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data penjualan untuk menu " + menu[i] + " : ");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = cfe.nextInt();
            }
        }
    }

    public static void tampilData() {
        System.out.println("\nData Penjualan");
        for (int i = 0; i < 5; i++) {
            System.out.print(menu[i] + " : ");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi() {
        int max = 0;
        String menuTertinggi = "";

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > max) {
                max = total;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah " + menuTertinggi + " dengan total penjualan " + max); 
    }

    public static void rataPenjualan() {
        System.out.println("\nRata rata penjualan: ");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / 7;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner cfe = new Scanner(System.in);
        int pilihAngka;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Tampilkan seluruh data penjualan");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan untuk setiap menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihAngka = cfe.nextInt();

            if (pilihAngka == 1) {
                inputData();
            } else if (pilihAngka == 2) {
                tampilData();
            } else if (pilihAngka == 3) {
                penjualanTertinggi();
            } else if (pilihAngka == 4) {
                rataPenjualan();
            } else if (pilihAngka == 5) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihAngka != 5);
    }
}
