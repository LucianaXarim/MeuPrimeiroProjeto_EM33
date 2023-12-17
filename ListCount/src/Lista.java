
import java.util.ArrayList;
import java.util.List;
public class Lista {
    public void Run() {
        // Criação da lista
        List<String> cores = new ArrayList<>();

        // Adicionando elementos
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Laranja");

        // Removendo um elemento
        cores.remove("Laranja");

        // Acessando elementos
        System.out.printf("Número de cores: %d\n", cores.size());
        System.out.printf("Primeira cor: %s\n", cores.get(0));
        System.out.printf("Última cor: %s", cores.get(cores.size() - 1));
    }
}
