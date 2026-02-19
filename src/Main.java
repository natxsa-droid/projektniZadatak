import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Unesi stranicu a:");
        double a = scanner.nextDouble();
        System.out.println("Unesi stranicu b:");
        double b = scanner.nextDouble();
        System.out.println("Unesi stranicu c:");
        double c = scanner.nextDouble();

        System.out.println("Unesi stranicu a:");
        double a2 = scanner.nextDouble();
        System.out.println("Unesi stranicu b:");
        double b2 = scanner.nextDouble();


        Pravokutnik pravokutnik1 = new Pravokutnik("Naziv pravokutnika", 6, 7);
        System.out.println(pravokutnik1.getNaziv());


    }
}
