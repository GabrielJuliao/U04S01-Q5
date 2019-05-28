
public class Circulo implements ObjetoGeometrico{
	double raio;
	public Circulo(double raio){
	this.raio=raio;	
	}
	public void calculaPerimetro(){
		double perimetro;
		perimetro = 2*3.14*raio;
		System.out.println("Perimetro do Circulo = "+perimetro);
	}
	public void calculaArea(){
		double area;
		area = 3.14*(raio*raio);
		System.out.println("Area do circulo = "+area);
	}
	public void saidaDados(int num) {
		// TODO Auto-generated method stub
		System.out.println("Circulo "+num);
		calculaPerimetro();
		calculaArea();
		System.out.println("\n\n\n");
		
	}
}
