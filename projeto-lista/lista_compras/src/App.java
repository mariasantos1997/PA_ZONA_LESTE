   import java.util.ArrayList;
   import java.util.Scanner;
    public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        ArrayList<String>listaCompras = new ArrayList<>();
        int opcaoLista = 0;
        int opcao = 0;   
        String novoItem = ""; 
        do{
                try{
                 System.out.println("""
             Bem-vindos ao programa lista de compras

             Escolha a opção desejada:
             1- Criar uma nova lista de compras
             2- Sair 

             """);
             opcaoLista = inUser.nextInt();
             inUser.nextLine();

             switch(opcaoLista){
                case 1 -> {
                    System.out.println("Lista criada com sucesso!");
                    do{
                        System.out.println("""
                                Escolha a opcao desejada:
                                1- Adicionar um item a lista
                                2- Remover um item da lista
                                3- Exibir a lista de compras
                                4- Limpar a lista de compras
                                5- Voltar ao menu principal
                                """);

                        opcao = inUser.nextInt();
                        inUser.nextLine();
                        
                        switch(opcao){
                            case 1 -> {
                                System.out.println("Você escolheu criar um item da lista \n");
                                System.out.println("Digite o nome do produto");

                                novoItem = inUser.nextLine();
                                listaCompras.add(novoItem);
                            }
                            case 2 -> {
                                System.out.println("Voce escolheu ver a lista");
                                for(String item : listaCompras){
                                    System.out.printf("%s \n, item");
                                }
                            }
                        }
                    }while (opcao != 5);
                
                }
                case 2 -> System.out.println("Obrigado por utilizar nosso sistema.");
                default -> System.out.println("Opção inválida.");

             }
              }catch(Exception erro){
            System.out.println("Erro entrada inválida");
            inUser.nextLine();
            opcaoLista = 1;
        }
            
    }while(opcaoLista != 2);    

       

      

      inUser.close();
    }
}

