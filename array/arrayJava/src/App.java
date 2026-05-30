import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        //Adiciona elementos à lista add()

        nomes.add("Maria");
        nomes.add("Eduarda");
         nomes.add("Alves");


        System.out.println(nomes);


        //Acessar um elemento get(indice)
        System.out.println(nomes.get(2));

        //Alterar um item
        nomes.set(0,"Prof");
        System.out.println(nomes);
       //System.out.println(nomes);

       //Remover um item da lista
       //nomes.add("remover este");
       //nomes.remove(2);
       //System.out.println(nomes);

       //tamanho da lista
       //System.out.println(nomes.size());

       //6 - apagar a lista
       //nomes.clear();
       //System.out.println(nomes);

       //7 - Verificar se existe
       System.out.println(nomes.contains("Eduarda")); 

    }
}
