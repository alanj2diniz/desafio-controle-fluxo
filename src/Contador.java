import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int parametroUm = scanner.nextInt();
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());  
        }

    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for(int indice = 0; indice < contagem; indice++) {
            System.out.println("Imprimindo o número: " + (indice + 1));
        }

    }


}
