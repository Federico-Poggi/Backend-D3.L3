package Es1;

public class Rettangle {
    /* Attributi Classe */
    private long height,base,perimeter,area;


    public long getBase() {
        return base;
    }

    public long getHeight() {
        return height;
    }

    /* metodi */
    public long getPerimeter(){
        this.perimeter= (this.base+this.height)*2;

        return this.perimeter;
    }

    public long getArea(){
        this.area=(this.base*this.height);
        return this.area;
    }


    public Rettangle(long base,long altezza){
        this.height=altezza;
        this.base=base;
    }

}
