import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("      CADASTRO CONTATOS     ");
        System.out.println("============================");

        Scanner sc= new Scanner(System.in);

        System.out.println("Informe o primeiro contato para cadastrar: ");
        String primeiroContato = sc.nextLine();

        System.out.println("Informe o segundo contato para cadastrar: ");
        String segundoContato = sc.nextLine();

        System.out.println("Informe o primeiro contato para cadastrar: ");
        String terceiroContato = sc.nextLine();

        valoresContatos(primeiroContato, segundoContato, terceiroContato);

        sc.close();
    }

    // LISTA DE CONTATOS PARA SER EXIBIDA
    public static void listaDeContatos(String primeiro, String segundo, String terceiro){
        System.out.println("============================");
        System.out.println("      LISTA DE CONTATOS     ");
        System.out.println("============================");
        System.out.println(primeiro);
        System.out.println("============================");
        System.out.println(segundo);
        System.out.println("============================");
        System.out.println(terceiro);
        System.out.println("============================");
    }

    //
    public static void valoresContatos(String primeiro, String segundo, String terceiro){

        // EXIBINDO A LISTA DE CONTATOS
        listaDeContatos(primeiro,segundo, terceiro);

        Scanner novoSc = new Scanner(System.in);

        System.out.println("Qual contato você deseja retirar[1º,2º,3º]: ");
        int numero = novoSc.nextInt();

        switch (numero){
            case 1:
                primeiro = "";
                System.out.println("Contato 1 foi apagado");

                System.out.println("============================");
                break;


            case 2:
                segundo = "";
                System.out.println("Contato 2 foi apagado");
                System.out.println("============================");
                break;

            case 3:
                terceiro = "";
                System.out.println("Contato 3 foi apagado");
                System.out.println("============================");
                break;

            default:
                System.out.println("Número inválido! Aceitamos apenas: 1,2,3");
        }

        // VERIFICANDO SE O CLIENTE DESEJA EXIBIR A LISTA DE CONTATOS
        System.out.println("Deseja exibir a lista novamente[S/N]: ");
        String escolha = novoSc.next();

        if(escolha.equalsIgnoreCase("S")){
            listaDeContatos(primeiro,segundo, terceiro);
        } else {
            System.out.println("============================");
            System.out.println("FIM DA LISTA DE CONTATOS");
        }


        }
}