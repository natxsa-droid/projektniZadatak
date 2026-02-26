import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> listaLikova = new ArrayList<>();

        System.out.println("Unesi naziv kruga:");
        String nazivKruga = scanner.nextLine();

        System.out.println("Unesi radijus :");
        double unesiRadijus = scanner.nextDouble();

        Krug krug1 = new Krug(nazivKruga, unesiRadijus);
        System.out.println(krug1.getNaziv());
        System.out.println(krug1.getRadius());


        System.out.println("Naziv trokuta:");
        scanner.nextLine();
        String nazivTrokuta = scanner.nextLine();
        System.out.println("Unesi stranicu a za trokut:");
        double a = scanner.nextDouble();
        System.out.println("Unesi stranicu b za trokut:");
        double b = scanner.nextDouble();
        System.out.println("Unesi stranicu c za trokut:");
        double c = scanner.nextDouble();
        Trokut trokut1 = new Trokut(nazivTrokuta, a, b, c);

        System.out.println("Unesi naziv pravokutnika:");
        scanner.nextLine();
        String nazivP = scanner.nextLine();

        System.out.println("Unesi stranicu a za pravokutnik:");
        double a2 = scanner.nextDouble();
        System.out.println("Unesi stranicu b za pravokutnik:");
        double b2 = scanner.nextDouble();

        Pravokutnik pravokutnik1 = new Pravokutnik(nazivP, a2, b2);
        System.out.println("Naziv pravokutnika je: " + pravokutnik1.getNaziv());
        System.out.println(pravokutnik1);
    }
}
