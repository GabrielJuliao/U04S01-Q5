
public class Quadrado extends Quadrilateros implements ObjetoGeometrico {


    public Quadrado(double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    public void calculaArea() {
        double area;
        area = a * b;
        System.out.println("Area do Quadrado = " + area);
    }

}
