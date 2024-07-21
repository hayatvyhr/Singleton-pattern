// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Journalisation s = Journalisation.getJournalisation();
        CompteBancaire compt = new CompteBancaire(123,4000);
        CompteBancaire compt2 = new CompteBancaire(321,3000);
        System.out.println("----compt1---");
        compt.deposerArgent(100);
        compt.retirerArgent(80);
        System.out.println("+++++++++++++++++++logs+++++++++++++++++++");
        System.out.println(s.getLogs());
        System.out.println("----compt2-----");
        Journalisation t = Journalisation.getJournalisation();
        compt2.deposerArgent(300);
        compt2.retirerArgent(40000);
        System.out.println("+++++++++++++++++++++++++logs+++++++++++++++++++++");
        System.out.println(t.getLogs());




    }
}