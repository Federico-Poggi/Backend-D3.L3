package Es2.sim;
import java.util.Random;
public class CallList {
    Random rand=new Random();
    float duration;
    long numberCalled;

    public long GetNumberCalled(){
        return numberCalled = rand.nextInt();
    }

    public float GetDuration(){
        return duration= (rand.nextFloat(1)*10);
    }



    @Override
    public String toString() {
        return this.duration+"\n"+ "\n" +this.numberCalled;

    }
}
