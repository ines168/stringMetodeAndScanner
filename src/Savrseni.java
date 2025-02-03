import java.util.Scanner;

public class Savrseni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Zadatak 2: Napišite program koji ispisuje je li uneseni broj savršen ili ne.
        //Savršen broj je broj koji je jednak zbroju svojih djelitelja (bez njega samoga). Npr. 6 (1 + 2 + 3 = 6)
        System.out.println("2.Savršeni brojevi");

        System.out.println("Unesi cijeli broj da ispitam dal je savršen: ");
        int broj = sc.nextInt();
        while (broj<=0) { //savršeni brojevi su pozitivni i veći od nule
            System.out.println("Ovo nije savršen broj. Broj mora biti veći od nule");
            broj = sc.nextInt();
        }
        int sumaDjelitelja = 0;
        for(int i = 1; i<broj; i++) {
            if(broj%i == 0) {
                sumaDjelitelja +=i;
            }
        }
        if(sumaDjelitelja == broj) {
            System.out.printf("\tBroj %d je savršen!\n", broj);
        } else {
            System.out.printf("\tBroj %d nije savršen.\n", broj);
        }
        sc.close();
    }
}
