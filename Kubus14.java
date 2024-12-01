import java.util.Scanner;

public class Kubus14 {
    
    public static int hitungVolumeKubus(int sisi) {
        int Volume = sisi * sisi * sisi;
        return Volume;
    }

    public static int hitungLuasKubus(int sisi) {
        int Luas = 6 * (sisi * sisi);
        return Luas;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();

        int volume = hitungVolumeKubus(sisi);
        System.out.println("Volume kubus adalah " + volume);

        int luas = hitungLuasKubus(sisi);
        System.out.println("Luas kubus adalah " + luas);
    }
}
