import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        // Inicialização das variáveis
        int parametroUm = 0;
        int parametroDois = 0;
        boolean entradaValida = false;

        while(!entradaValida){
            try{
                System.out.print("Digite o primeiro parâmetro: ");
                parametroUm = scan.nextInt();
                scan.nextLine(); // limpa o buffer
                
                // Verifica se o primeiro parâmetro é negativo ou zero
                if(parametroUm <= 0){
                    System.out.println("O primeiro parâmetro precisa ser um número positivo maior que 0.");
                    continue; // retorna ao início do loop
                }

                System.out.print("Digite o segundo parâmetro: ");
                parametroDois = scan.nextInt();
                scan.nextLine(); // limpa o buffer
                
                // Verifica se o segundo parâmetro é negativo ou zero
                if(parametroDois <= 0){
                    System.out.println("O segundo parâmetro precisa ser um número positivo maior que 0.");
                    continue; // retorna ao início do loop
                }

                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
                entradaValida = true;

            } catch(InputMismatchException e) {
                System.out.println("primeiro e segundo parâmetro precisam ser um número inteiro");
                scan.nextLine(); // limpa o buffer
            }
            catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }

        scan.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        // Verifica se o parâmetro 1 é maior ou igual ao parâmetro 2
        if(parametroUm >= parametroDois){
            // Lança a exceção especial
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) { // for de 1 até contagem
            System.out.println("Imprimindo o número " + i);
        }
    }
}