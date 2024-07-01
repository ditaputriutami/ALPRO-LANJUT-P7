import java.util.Scanner;
public class LatTam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] NamaMhs = new String[10];
        int[][] NilaiMhs = new int[10][3];
        double[] RR = new double[10];
        String[] Ket = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            NamaMhs[i] = input.nextLine();
            for (int j = 0; j < 3; j++) {
  				System.out.print("Masukkan Nilai Mata Kuliah " + (j + 1) + ": ");
                NilaiMhs[i][j] = input.nextInt();
                input.nextLine();
            }
        }

        // Menghitung rata-rata dan keterangan
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += NilaiMhs[i][j];
            }
            RR[i] = (double) total / 3;
            if (RR[i] >= 80 && RR[i] <= 100) {
                Ket[i] = "Sangat Baik";
            } else if (RR[i] >= 50 && RR[i] <= 79) {
                Ket[i] = "Baik";
            } else {
                Ket[i] = "Kurang Baik";
            }
 }

        // Menampilkan hasil
        System.out.println("\nHasil:");
        System.out.println("Nama\tMata Kuliah 1\tMata Kuliah 2\tMata Kuliah 3\tRata-rata\tKeterangan");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s\t%d\t\t%d\t\t%d\t\t%.2f\t\t%s\n", NamaMhs[i], NilaiMhs[i][0], NilaiMhs[i][1], NilaiMhs[i][2], RR[i], Ket[i]);
        }
    }
}

