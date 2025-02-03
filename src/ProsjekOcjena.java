import java.util.Scanner;

public class ProsjekOcjena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Zadatak 3: Unijeti u program broj ocjena po želji, ispisati prosjek ocjena. (int brojGodina = Integer.parseInt(sc.nextLine());)
        System.out.println("3.Prosjek ocjena");

        int ocjena;
        int sumaOcjena = 0;
        int brojOcjena = 0;
        do {
            System.out.println("Unesi ocjenu. Ako si unio sve ocjene izađi sa nulom '0'");
            ocjena = Integer.parseInt(sc.nextLine());
            if (ocjena > 0 && ocjena <=5) { //važeće ocjene su 1-5
                sumaOcjena+=ocjena;
                brojOcjena++;
            } else {
                System.out.println("Ovo nije važeća ocjena!"); }
        } while (ocjena!=0);


        if (brojOcjena != 0) { //nema djeljenja s nulom
            double prosjekOcjena = (double) sumaOcjena/brojOcjena;
            System.out.printf("\tProsjek ovih %d ocjena je: %.2f\n", brojOcjena, prosjekOcjena);
        }

        sc.close();
    }
}
