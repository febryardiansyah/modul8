package nomor2;

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        double penyebut, pembilang, hasil;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Masukan Pembilang : ");
            pembilang = scan.nextDouble();
            System.out.print("Masukan Penyebut : ");
            penyebut = scan.nextDouble();

            if (penyebut == 0) {
                throw new ArithmeticException();
            }
            hasil = pembilang / penyebut;
            System.out.println("Hasilnya adalah : "+hasil);
        }catch (ArithmeticException e){
            System.out.println("Kegagalan Aritmatika");
        }

    }
}
