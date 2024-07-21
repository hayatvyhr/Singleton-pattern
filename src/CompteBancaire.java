public class CompteBancaire {
    private int number;
    private double solde;


    public  CompteBancaire(int number){
      this.number= number;
    }
    public  CompteBancaire(int number, double money){
        this.number= number;
        this.solde = money;
    }
    public CompteBancaire() {
    }

    public  void deposerArgent(double number){
        if (number < 0) {

            Journalisation.getJournalisation().ajouterLog("\n*****impossi****** "+number);
        }
        else {
            solde = solde + number;


            Journalisation.getJournalisation().ajouterLog("\n*******despose******  " + number +"  ******vous avez*****   " + solde);
        }
    }
   public void retirerArgent(double nbr){
       if (nbr < 0) {
           Journalisation.getJournalisation().ajouterLog("\n******impossi ********   "+nbr);
       }
        else if(nbr <= solde) {
            solde = solde - nbr;
            Journalisation.getJournalisation().ajouterLog("\n*******retirer*******: " +nbr);

        }
        else{
            System.out.println("********impossible de retirer****** ");
        }
        }

}
