import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmarTV smartv = new SmarTV();

        System.out.println("A TV está ligada? " + smartv.ligado);
        System.out.println("Volume atual: " + smartv.volume);
        System.out.println("Canal atual: " + smartv.canal);

        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.diminuteVolume();
        System.out.println("Volume atual: " + smartv.volume);


        smartv.ligarTV();
        System.out.println(smartv.ligado);
        System.out.println("A TV está ligada? " + smartv.ligado);

        smartv.definirCanal(14);
        System.out.println("Canal atual: " + smartv.canal);







    }
}