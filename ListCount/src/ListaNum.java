import java.util.ArrayList;
import java.util.List;


public class ListaNum {
    public void Runum() {
        // Criação da lista
        List<Integer> Listanum = new ArrayList<>();

        // Adicionando elementos
        Listanum.add(10);
        Listanum.add(25);
        Listanum.add(25);
        Listanum.add(31);
        Listanum.add(30);
        Listanum.add(30);
        Listanum.add(42);
        Listanum.add(42);
        Listanum.add(45);
        Listanum.add(45);
        Listanum.add(45);


        // classe que contem o valor do número e a quantidade de ocorrências
        class Number {
            int value;
            int count;

            public  Number(int x, int y){
                value = x;
                count = y;
            }
        }

        //int i, j;
        boolean found;

        //<Number> lista = new ArrayList<Number>();
        ArrayList<Number> lista = new ArrayList<Number>();

        for (int i = 0; i < Listanum.size(); i++) {
            //System.out.println(Listanum.get(i));
            // seta como não encontrado
            found = false;

            // procura na lista de números o elemento "i" do array de entrada
            for(int j=0; j< lista.size(); j++){
                // encontrou, incrementa e sai fora
                if (Listanum.get(i) == lista.get(j).value){
                    lista.get(j).count++;
                    found = true;
                    break;
                }
            }

            // não encontrou o número, armazena
            if (!found)
                lista.add(new Number(Listanum.get(i), 1));
        }
        System.out.println("[Número, Repetições]");
        for (Number n:lista)
            System.out.println("[" + n.value + ", " + n.count + "]");
    }
}
