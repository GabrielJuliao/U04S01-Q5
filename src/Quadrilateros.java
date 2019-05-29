
public abstract class Quadrilateros {
    double a;
    double b;
    double c;
    double d;

    public Quadrilateros(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public final void calculaPerimetro() {
        double perimetro;
        String forma = null;
        perimetro = a + b + c + d;
        if (a == b && b == c && c == d) {
            forma = "Quadrado";
        } else if (a == c && b == d) {
            forma = "Retangulo";
        } else
            forma = "Quadrilatero";
        System.out.println("Perimetro do " + forma + "= " + perimetro);
    }
}
