import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float boy,kilo,vke;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextFloat();

        vke = kilo / (boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vke);
    }
}