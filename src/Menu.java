import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<Quadrado> listaquadrado = new ArrayList<>();
	ArrayList<Retangulo> listaretangulo = new ArrayList<>();
	ArrayList<Circulo> listacirculo = new ArrayList<>();
public void menuPrincipal() {
	int s = 0;
	int qtd = 0;
	int x=0;
	double a = 0, b = 0, c = 0, d = 0;
	boolean g = true;
	
	
while(g) {
	
	Scanner in = new Scanner(System.in);
	System.out.println("Digite A Quantidade de (0 à X) de Objetos A Ser Criado: ");
	qtd = in.nextInt();
	if(qtd==0) {
		g=false;
		break;
	}else {
	System.out.println("Escolha A Forma A Ser Criada!");
	System.out.println("1-Quadrado, 2-Retangulo, 3-Circulo");
	s = in.nextInt();
	if(s==1) {
		System.out.println("Digite Um Lado Do Seu Quadrado:");
		a=in.nextDouble();
		b=a;
		c=a;
		d=b;
	}else
		if(s==2) {
			System.out.println("Digite A Base Do Seu Retangulo:");
			a=in.nextDouble();
			System.out.println("Digite A Altura Do Seu Retangulo:");
			b=in.nextDouble();
			c=a;
			d=b;
			
		}else
			if(s==3) {
				System.out.println("Digite O Raio Do Seu Circulo:");
				a=in.nextDouble();
			}
	
	
	switch(s) {
	case 1:
		while(x<qtd) {
			Quadrado quadrado = new Quadrado(a, b, c, d);
			listaquadrado.add(quadrado);
			x++;
		}
		break;
	case 2:
		while(x<qtd) {
			Retangulo retangulo = new Retangulo(a, b, c, d);
			listaretangulo.add(retangulo);
			x++;
		}
		break;
	case 3:
		while(x<qtd) {
			Circulo circulo = new Circulo(a);
			listacirculo.add(circulo);
			x++;
		}
		break;
	default:
		System.out.println("Opçao Invalida!");
		break;
	}
   }

  }
 }
public void imprimiDados() {
	System.out.println("\nQuadrados\n");
	dadosQuadrado();
	System.out.println("\nRetangulos\n");
	dadosRetangulo();
	System.out.println("\nCirculos\n");
	dadosCirculo();	
 }
public void dadosQuadrado() {
	int num=1;
	
	for(Quadrado quadrado : listaquadrado) {
		if(listaquadrado!=null) {
	   quadrado.saidaDados(num);
	num++;
	}
	}

}

public void dadosRetangulo() {
	int num2=1;
	
	for(Retangulo retangulo : listaretangulo) {
		if(listaretangulo!=null) { 
	   retangulo.saidaDados(num2);
	num2++;
	}
		}
}
public void dadosCirculo() {
	int num3=1;
	
	for(Circulo circulo : listacirculo) {
		if(listacirculo!=null) { 
	   circulo.saidaDados(num3);
	num3++;
	}
	    }
}
}
