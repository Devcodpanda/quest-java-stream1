import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Black Widow", 34, false));
        heroes.add(new Hero("Captain America", 100, false));
        heroes.add(new Hero("Vision", 3, true));
        heroes.add(new Hero("Iron Man", 48, false));
        heroes.add(new Hero("Scarlet Witch", 29, true));
        heroes.add(new Hero("Thor", 1501, false));
        heroes.add(new Hero("Spider-Man", 18, false));
        heroes.add(new Hero("Hulk", 49, true));
        heroes.add(new Hero("Doctor Strange", 42, false));

        // utilise un Stream et la méthode  filter pour récupérer dans elders la liste des héros de 60 ans et plus
        // TODO 1 : filter heroes in order to found heroes older than 59

        List<Hero> elders;
        elders = heroes.stream()
                .filter(item -> item.getAge() > 59)
                .collect(Collectors.toList());

        System.out.println("\nElders:");
        for (Hero elder : elders) {
            System.out.println(elder.getName());
        }
        // utilise un Stream et la méthode filter pour récupérer dans intolerants la liste des héros intolérants au gluten
        // TODO 2 : filter heroes in order to found heroes that are gluten intolerants
        List<Hero> intolerants;
        intolerants = heroes.stream()
                .filter(item -> item.isGlutenIntolerant())
                .collect(Collectors.toList());

        System.out.println("\nGluten intolerants:");
        for (Hero intolerant : intolerants) {
            System.out.println(intolerant.getName());
        }
    }

}

