import java.util.Scanner;
public class Atividade {

    public static void main (String[] args) {
        System.out.println("Menu de Opções");
        int opcao;
        do {
            System.out.println("1. Opção 1");
            System.out.println("2. Opção 2");
            System.out.println("3. Sair");

            Scanner menu = new Scanner(System.in);
            System.out.print("Selecione a opção: ");
            opcao = menu.nextInt();

            selecionar(opcao);

        } while (opcao != 3);       
        
    }
        public static void selecionar(int opcao){
            switch(opcao){
                case 1: {
                    System.out.println("Você escolheu a primeira opção");
                    break;
                }
                case 2: {
                    System.out.println("Você escolheu a segunda opção");
                    break;
                }
                case 3: {
                    System.out.println("O programa foi encerrado.");
                    
                }
            }
        }







    }
