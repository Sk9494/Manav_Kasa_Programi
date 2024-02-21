import sun.security.ssl.SSLContextImpl;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kiloArmut,kiloElma,kiloDomates,kiloMuz,kiloPatlican;
        double fiyatArmut= 2.14, fiyatElma= 3.670, fiyatDomates=1.11, fiyatMuz=0.95, fiyatPatlican=5.00;

        Scanner inp= new Scanner(System.in);

        System.out.print("Armut Kaç kilo: ");
        kiloArmut = inp.nextDouble();
        System.out.print("Elma Kaç kilo: ");
        kiloElma =inp.nextDouble();
        System.out.print("Domates Kaç kilo: ");
        kiloDomates =inp.nextDouble();
        System.out.print("Muz Kaç kilo: ");
        kiloMuz=inp.nextDouble();
        System.out.print("Patican Kaç kilo: ");
        kiloPatlican=inp.nextDouble();

        //Toplam Fiyat Hesapla
        Double toplamFiyat =(kiloArmut * fiyatArmut) + (kiloElma * fiyatElma)+(kiloDomates * fiyatDomates)+ (kiloMuz * fiyatMuz)+(kiloPatlican * fiyatPatlican);


        System.out.println("Toplam Fiyat: " + toplamFiyat + "TL");
    }
}