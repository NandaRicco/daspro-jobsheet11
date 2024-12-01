import java.util.Scanner;

public class Mahasiswa {

    public static int[][] isianArray(int jumlahMahasiswa, int jumlahTugas) {
        Scanner mhs = new Scanner(System.in);
        int[][] array = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan Nilai Tugas untuk Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                array[i][j] = mhs.nextInt();
            }
        }
        return array;
    }

    public static void tampilArray(int[][] arr) {
        System.out.println("Isi Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int hitTotal(int[][] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner mhs = new Scanner(System.in);

        int total = 0, jumMahasiswa, jumTugas;
        int[][] dataArray;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumMahasiswa = mhs.nextInt();

        System.out.print("Masukkan Jumlah Tugas: ");
        jumTugas = mhs.nextInt();

        dataArray = isianArray(jumMahasiswa, jumTugas);

        tampilArray(dataArray);

        total = hitTotal(dataArray);

        System.out.println("Total Nilai Mahasiswa : " + total);
    }
}