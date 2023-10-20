package day01;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {

        float kilo;
        float endeks,boy;
        Scanner input= new Scanner(System.in);

        System.out.println("kilonuzu giriniz: ");
        kilo=input.nextFloat();

        System.out.println("boyunuzu metre cinsinden giriniz: ");
        boy=input.nextFloat();

        endeks=kilo/(boy*boy);

        System.out.println("vücut kitle endeksiniz: "+endeks);



    }
}
