package Es1;

public class Rettangle {
    /* Attributi Classe */
    private long height,base,perimeter,area;



    /* reading method */
    public long getArea() {
        return area;
    }

    public long getBase() {
        return base;
    }

    public long getHeight() {
        return height;
    }

    public long getPerimeter() {
        return perimeter;
    }



    /* metodi classe */
    public long perimetro(long base, long altezza){
        perimeter= (base+altezza)*2;

        return perimeter;
    }


    public long areaRet(long base, long altezza){
        area=(base*altezza);
        return area;
    }





    public Rettangle(long base,long altezza){
        this.height=altezza;
        this.base=base;
        this.perimeter=perimetro(base, altezza);
        this.area=areaRet(base, altezza);
    }

}
