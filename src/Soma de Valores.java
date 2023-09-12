import java.util.Scanner;
public class Valor {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero1,numero2,soma;
            
        System.out.println("Digite o Primeiro valor");
        numero1 = leitor.nextInt();
        System.out.println("Digite o Segundo valor");
        numero2 = leitor.nextInt();

        soma = numero1 + numero2;
            

        System.out.print("O resultado da soma é " + soma);

    
    } 
}