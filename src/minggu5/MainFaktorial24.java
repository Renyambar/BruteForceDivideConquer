package minggu5;
import java.util.Scanner;
public class MainFaktorial24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial24 fk = new Faktorial24();
        System.out.println("Nilai faktorial " + nilai +" menggunakan BF: "+fk.FaktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+" menggunakan DC: "+fk.FaktorialDC(nilai));
    }
}
