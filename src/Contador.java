import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {  // Corrigido para aceitar argumentos de linha de comando
        Scanner scanner = new Scanner(System.in);

        // Corrigido o tipo de variável de 'Int' para 'int'
        int parametroUm = scanner.nextInt();
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);  // Chama o método contar
        } catch (Exception e) {  // Corrigido o bloco catch
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } finally {
            scanner.close();  // Fecha o scanner
        }
    }

    // Método contar que lança uma exceção personalizada
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            // Lança uma exceção personalizada se os parâmetros forem inválidos
            throw new ParametrosInvalidosException();
        }

        // Imprime a contagem de parametroUm até parametroDois
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}

