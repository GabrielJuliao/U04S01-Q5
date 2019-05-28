
public class Retangulo extends Quadrilateros implements ObjetoGeometrico{



	public Retangulo(double a, double b, double c, double d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculaArea() {
		// TODO Auto-generated method stub
		double area;
		area=a*b;
		System.out.println("Area do Retangulo = "+area);
	}

	public void saidaDados(int num) {
		// TODO Auto-generated method stub
		System.out.println("Retangulo "+num);
		super.calculaPerimetro();
		calculaArea();
		System.out.println("\n\n\n");
		
	}

}
