import java.util.Scanner;

public class Kafe14 {

    public static void Menu(String namaPelanggan, boolean isMember){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pesanan");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo){
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode Invalid, tidak ada pengurangan total harga.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true);

        Scanner kfe = new Scanner(System.in);
        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (atau 0 untuk selesai): ");
            int pilihanMenu = kfe.nextInt();
            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan  : ");
            int banyakItem = kfe.nextInt();
            System.out.print("Masukkan kode promo                      : ");
            String kodePromo = kfe.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.println("Total harga untuk pesanan ini: Rp " + totalHarga);
        }

        System.out.println("Total keseluruhan untuk semua pesanan Anda: Rp " + totalKeseluruhan);
    }
}