import java.util.Scanner;

public class App {
 public static void main(String[] args) {
    System.out.println("Digite um número: ");
    Scanner input = new Scanner(System.in);
    Double numero1 = input.nextDouble();
    System.out.println("Digite Mais um núemro");
    Double numero2 = input.nextDouble();
    Double Total = numero1 + numero2;
    input.close();
    System.out.println("A soma dos dois número é: " + Total);


 }
}