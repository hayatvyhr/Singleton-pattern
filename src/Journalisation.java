public class Journalisation {
    private String logs ="";
    private static final Journalisation Journalisation;

    static{
        Journalisation = new Journalisation();
    }
    private  Journalisation(){

  }

public static Journalisation getJournalisation(){
        return Journalisation;
}

    public void ajouterLog(String message) {
        this.logs  += message +"\n";
        System.out.println("\n----------     Message de log ajouté :  ---------" + message);
    }

    public String getLogs() {
        return logs;
    }
}
