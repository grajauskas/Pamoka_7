package lt.egidijusman;

public class Main {
    public static void main(String[] args) {

//        char kintChar = 'A';
//        int kintInt = kintChar;
//
//        System.out.println(kintInt);
//        System.out.println(kintChar);

        Imone imone = new Imone("Sauni komanda", 2015);

        Darbuotojas darbuotojas1 = new Darbuotojas("Charlie", "Chaplin", "3020410123");
        Darbuotojas darbuotojas2 = new Darbuotojas("tomas", "jeris", "5020410123");
        Darbuotojas darbuotojas3 = new Darbuotojas("Marilyn", "Monroe", "490041800123");
        Darbuotojas darbuotojas4 = new Darbuotojas("Jennifer", "Aniston", "605041800123");
        Darbuotojas darbuotojas5 = new Darbuotojas("Halle", "Berry", "470041800123");


        darbuotojas1.spausdingDarbuotojoInfo();
        darbuotojas2.spausdingDarbuotojoInfo();

        imone.pridekDarbuotoja(darbuotojas1, "Directoriu", 80);
        imone.pridekDarbuotoja(darbuotojas2, "Vadybininkas", 2);
        imone.pridekDarbuotoja(darbuotojas3, "sekretore", 8);
        imone.pridekDarbuotoja(darbuotojas4, "vadibininkas", 20);
        imone.pridekDarbuotoja(darbuotojas5, "vadibinike", 70);

        System.out.println(imone.getDabuotojai());

        imone.getDabuotojai().forEach(drb -> drb.spausdingDarbuotojoInfo());
        System.out.println("----------------------------------");
        imone.filtuokDarbuotojus(40);
    }
}


















