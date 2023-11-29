package Es2.sim;

public class Sim {
    /* ATTRIBUTI */
    private String cellNumber;
    private float credit;
    private String name;
    private String surname;

    CallList callList;
    public Sim(String name, String surname, String cellNumber){
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



    public String getCellNumber() {
        return cellNumber;
    }
}
