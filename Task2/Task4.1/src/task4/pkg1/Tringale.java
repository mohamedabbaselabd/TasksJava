
package task4.pkg1;

public class Tringale 
{
      private double base;
    private double high;

    public void setBase(double b) {
        this.base = b;
    }

    public void setHigh(double h) {
        this.high = h;
    }

    public double getBase() {
        return base;
    }

    public double getHigh() {
        return high;
    }
    public double getArea(){
        return (0.5 * high *base);
    }
}
