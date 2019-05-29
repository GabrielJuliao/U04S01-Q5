
public class Quadrado extends Quadrilateros implements ObjetoGeometrico{



	public Quadrado(double a, double b, double c, double d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}

	public void calculaArea() {
		// TODO Auto-generated method stub
		double area;
		area=a*b;
		System.out.println("Area do Quadrado = "+area);
	}

}
