package Es2.sim;

public class Sim {
    /* ATTRIBUTI */
    private double cellNumber;
    private float credit;
    private String name;
    private String surname;

    CallList callList;
    public Sim(String surname, String name, double cellNumber){
        this.name=name;
        this.surname= surname;
        this.cellNumber=cellNumber;
        this.credit=credit;
        this.callList=new CallList();
    }



    /*getters*/

    public float getCredit() {
        return credit;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCellNumber() {
        return cellNumber;
    }
}
