package nomor1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args)throws Exception {
        float r,t,volume;
        double phi =3.14;

        Scanner scan = new Scanner(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pilih Metode");
        System.out.println("1. Scanner");
        System.out.println("2. Buffered Reader");
        System.out.print("Masukan Pilihan : ");
        int input = scan.nextInt();
        System.out.println("=====================");
        switch (input){
            case 1:
                System.out.println("Anda Memilih Scanner");
                System.out.print("Jari Jari : ");
                r = scan.nextFloat();
                System.out.print("Tinggi : ");
                t = scan.nextFloat();
                volume = (float) ((1.0/3.0)*(phi*r*r)*t);
                System.out.println("Volume Kerucut Adalah : "+volume);
                break;
            case 2 :
                System.out.println("Anda memilih Buffered Reader");
                System.out.print("Jari Jari : ");
                r = Integer.parseInt(bfr.readLine());
                System.out.print("Tinggi : ");
                t = Integer.parseInt(bfr.readLine());
                volume = (float) ((1.0/3.0)*(phi*r*r)*t);
                System.out.println("Volume Kerucut Adalah : "+volume);
                break;
            default:
                System.out.println("Pilihan yang anda Masukan Tidak Valid");
                break;
        }
    }
}
