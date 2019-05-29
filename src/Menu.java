import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    //Todo padrão do nome das variaveis usando LowerCamelCase
    // antes estava ex: listaquadrado
    private List<Quadrado> listaQuadrado = new ArrayList<>();
    private List<Retangulo> listaRetangulo = new ArrayList<>();
    private List<Circulo> listaCirculo = new ArrayList<>();

    public void menuPrincipal() {
        int s;
        int qtd;
        int x = 0;
        double a = 0, b = 0, c = 0, d = 0;
        //boolean g = true;

        while (true) {

            Scanner in = new Scanner(System.in);
            System.out.println("Digite A Quantidade de (0 � X) de Objetos A Ser Criado: ");
            qtd = in.nextInt();
            if (qtd == 0) {
                //g=false;
                break;
            } else {
                System.out.println("Escolha A Forma A Ser Criada!");
                System.out.println("1-Quadrado, 2-Retangulo, 3-Circulo");
                s = in.nextInt();
                if (s == 1) {
                    System.out.println("Digite Um Lado Do Seu Quadrado:");
                    a = in.nextDouble();
                    b = a;
                    c = a;
                    d = b;
                } else if (s == 2) {
                    System.out.println("Digite A Base Do Seu Retangulo:");
                    a = in.nextDouble();
                    System.out.println("Digite A Altura Do Seu Retangulo:");
                    b = in.nextDouble();
                    c = a;
                    d = b;

                } else if (s == 3) {
                    System.out.println("Digite O Raio Do Seu Circulo:");
                    a = in.nextDouble();
                }


                switch (s) {
                    case 1:
                        while (x < qtd) {
                            Quadrado quadrado = new Quadrado(a, b, c, d);
                            listaQuadrado.add(quadrado);
                            x++;
                        }
                        // TODO: 29/05/2019 erro da impressão pq o x não era zerado após o laço e no outro
                        // Todo laço já chegava com valor setado, poderia usar decrementar o qtd ex abaixo
                        x = 0;
                        break;
                    case 2:
                        while (x < qtd) {
                            Retangulo retangulo = new Retangulo(a, b, c, d);
                            listaRetangulo.add(retangulo);
                            qtd--;
                        }
                        break;
                    case 3:
                        while (x < qtd) {
                            Circulo circulo = new Circulo(a);
                            listaCirculo.add(circulo);
                            x++;
                        }
                        x = 0;
                        break;
                    default:
                        System.out.println("Op�ao Invalida!");
                        break;
                }
            }

        }
    }

    public void imprimiDados() {


        int numquad = 1;
        /*try {*/ //Todo não vejo necessidade de tratar exceção pq ele só entra no for qdo tem objeto na lista
        System.out.println("\nQuadrados\n");
        for (Quadrado quadrado : listaQuadrado) {

            /*if (listaQuadrado != null) {*/  //Todo essa verificação sempre vai dar true, pq a lista é inicialada
            // Todo quando vc declara a variavel, então é uma lista vazia, nunca null
            System.out.println("Quadrado " + numquad);
            quadrado.calculaPerimetro();
            quadrado.calculaArea();
            numquad++;
            System.out.println("\n\n\n");
            /* }*/
        }
     /*   } catch (Exception e) {
            e.printStackTrace();
        }*/

        System.out.println("\nRetangulos\n");


        int numretang = 1;


        try {
            for (Retangulo retangulo : listaRetangulo) {
                if (listaRetangulo != null) {
                    System.out.println("Retangulo " + numretang);
                    retangulo.calculaPerimetro();
                    retangulo.calculaPerimetro();
                    numretang++;
                    System.out.println("\n\n\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int numcirc = 1;

        try {
            for (Circulo circulo : listaCirculo) {
                if (listaCirculo != null) {
                    System.out.println("Circulo " + numcirc);
                    circulo.calculaPerimetro();
                    circulo.calculaArea();
                    numcirc++;
                    System.out.println("\n\n\n");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }//method
}//class
