
public class Retangulo extends Quadrilateros implements ObjetoGeometrico {


    public Retangulo(double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    public void calculaArea() {
        double area;
        area = a * b;
        System.out.println("Area do Retangulo = " + area);
    }

}
