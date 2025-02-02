import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zadatak 1: Domaće istraživanje ostalih metoda rada sa Stringom: https://www.w3schools.com/java/ref_string_replace.asp
        System.out.println("1.Ostale metode String");
        String testString = "Lorem Ipsum dolor sit amet \uD835\uDC9C, \uD835\uDD39 "; //string literal
        String testString2 = new String("Lorem Ipsum "); //string object
        String testString3 = "";
        String testString4 = "%s";
        char[] testArray = new char[15];


        System.out.println("CharAt[0]:" + testString.charAt(0));
        System.out.println("UnicodeAt[0]:" + testString.codePointAt(0));
        System.out.println("Unicode Before [1]:" + testString.codePointBefore(1));
        System.out.println("Broji Unicode od do indexa :" + testString.codePointCount(0, 5)); //emoji, matematički simboli, note, stvaraju se kombinacijom dva unicodea
        System.out.println("Compare Unicode of each character:" + testString.compareTo(testString2)); //0 if true
        System.out.println("Compare Unicode ignore case:" + testString.compareToIgnoreCase(testString2)); //0 if true
        System.out.println("Concat strings:" + testString.concat(testString2));
        System.out.println("String 1 contains string2:" + testString.contains(testString2)); //substring
        System.out.println("String 1 content equals string2:" + testString.contentEquals(testString2)); //full content
        System.out.println("Copy characters into string:" + testString3.copyValueOf(new char[]{'a', 'b', 'c'}, 1, 2));
        System.out.println("Ends With:" + testString.endsWith("\uD835\uDD39 "));
        System.out.println("Equals:" + testString.equals(testString2));
        System.out.println("Equals ignoring case:" + testString.equalsIgnoreCase(testString2));
        System.out.println("Format:" + String.format(testString4, "Lorem"));
        System.out.println("GetBytes:" + testString2.getBytes()[1]); //converts a string into an array of bytes
        testString2.getChars(6, 11, testArray, 2);//copies characters from a string to a char array
        System.out.println("GetChars:" + new String(testArray));
        System.out.println("Hash string:" + testString2.hashCode());
        System.out.println("Index of:" + testString2.indexOf("orem"));
        System.out.println("Is empty:" + testString2.isEmpty());
        System.out.println("Join:" + String.join(", ", "Alfa", "Beta", "Gama"));
        System.out.println("Last index of:" + testString2.lastIndexOf(" "));
        System.out.println("Length:" + testString2.length());
        String regex = "pas|macka";
        System.out.println("Matches:" + "pas".matches(regex)); //if entire string matches given regex, testString.matches(".*sit.*")
        System.out.println("OffsetByCodePoints:" + testString2.offsetByCodePoints(3, 2)); //returns an index which is offset by number
        System.out.println("Region matches:" + testString.regionMatches(0, testString2, 0, 5)); //compares regions in two different strings
        System.out.println("Replace characters :" + testString2.replace('l', 'p'));
        System.out.println("Replace substring:" + testString.replaceAll("sit", "sin"));
        System.out.println("Replace first:" + testString.replaceFirst("sin", "sit")); //replaces the first match
        System.out.println("Split: " + Arrays.toString(testString.split(" "))); //returns array from string, " " is separator
        System.out.println("Starts with:" + testString2.startsWith("llo"));
        System.out.println("SubSequence: " + testString.subSequence(7, 12)); //returns CharSequence
        System.out.println("Substring: " + testString.substring(7, 12));    //returns String
        System.out.println("To char array: " + Arrays.toString(testString2.toCharArray())); //returns a new char array
        System.out.println("To lowercase: " + testString2.toLowerCase());
        System.out.println("To string: " + testString2.toString()); //returns the string itself
        System.out.println("To uppercase: " + testString2.toUpperCase());
        System.out.println("Trim: " + "        Hello    World   !   ".trim());
        System.out.println("Value of: " + String.valueOf('A'));   //string representation of the specified value


        System.out.println();

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
        sc.nextLine();  //jer je zadnji .nextInt() koji nije uhvatio enter
        System.out.println();

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

