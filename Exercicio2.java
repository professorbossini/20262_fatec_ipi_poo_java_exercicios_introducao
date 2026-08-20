import java.util.Scanner;
public class Exercicio2{
  public static void main(String... args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite a distância:");
    double distancia = leitor.nextDouble();
    System.out.println("Digite o consumo em km/l");
    double consumo = leitor.nextDouble();
    System.out.println("Preço do litro");
    double preco = leitor.nextDouble();
    double litros = distancia / consumo;
    double custo = litros * preco;
    System.out.println("Litros necessários: " + litros);
    System.out.printf("Custo total R$%.2f", custo);
    leitor.close();
  }
}