import java.util.Scanner;
public class Lat3_7 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int score, sum = 0;


        while (int score != -1) {
			  System.out.print("Masukan nilai - 1 untuk keluar = ");
            score = masuk.nextInt();
            if (score != -1) {

            }

          sum = sum + score;
        }

        System.out.println("hasil penjumlahan = "+sum);
	}
}