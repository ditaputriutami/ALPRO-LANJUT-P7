import java.util.*;
import java.lang.Math;

class Lat1TambahanDoWhile {
  public static void main(String[] args) {
    int i = 0;
    int hasil;

    do {
      System.out.println("Nilai i adalah " + i);
      i += 2;

      int j = 15;
      do {
        if (i < j) {
          hasil = i * j;
        } else {
          hasil = i + j;
        }
        System.out.println("Nilai i=" + i + " dan j=" + j);
        System.out.println("Hasil=" + hasil);
        j += 3;
      } while (j <= 10);

      System.out.println("----");
    } while (i <= 10);

    System.out.println("Selesai");
  }
}
