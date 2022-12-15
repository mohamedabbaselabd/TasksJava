
package task4.pkg1;
public class Circle 
{
     private double redius;
    public void setRedius(double r) {
        this.redius = r;
    }

    public double getRedius() {
        return redius;
    }
    public double getArea(double area){
        return (redius* redius* 3.14);
    }
}
