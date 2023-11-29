package Es2.sim;
import java.util.Random;

public class Sim {
    Random random=new Random();
    /* ATTRIBUTI */
    private String cellNumber;
    private float credit;
    private String name;
    private String surname;

    CallList[] callList;
    public Sim (String name, String surname, String cellNumber){
        this.name=name;
        this.surname= surname;
        this.cellNumber=cellNumber;
//        this.callList=new CallList[5];
    }

    /*getters*/

    public float getCredit() {
        this.credit=random.nextFloat(15);
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
