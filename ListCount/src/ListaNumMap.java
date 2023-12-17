import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListaNumMap {
    public void Runumap() {
        // Criação da lista
        List<Integer> Listanumap = new ArrayList<>();

        // Adicionando elementos
        Listanumap.add(10);
        Listanumap.add(25);
        Listanumap.add(25);
        Listanumap.add(31);
        Listanumap.add(30);
        Listanumap.add(30);
        Listanumap.add(42);
        Listanumap.add(42);
        Listanumap.add(45);
        Listanumap.add(45);
        Listanumap.add(45);

        // Resolução via Map
        Map<Integer, Long> collect = Listanumap.stream().collect(Collectors.groupingBy(Lista -> Lista, Collectors.counting()));
        System.out.println(collect); // {AAA=3, CCC=1, BBB=2}
    }
}