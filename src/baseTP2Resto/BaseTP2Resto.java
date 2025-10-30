package baseTP2Resto;

import java.util.*;

public class BaseTP2Resto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<Integer, String>> allDishes = creation_dishes();

        System.out.println("Bonjour, combien de menus souhaitez-vous ?");
        int number_of_menus = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= number_of_menus; i++) {
            List<String> menu = new ArrayList<>();

            // Choix de l'entrée
            Map<Integer, String> entries = allDishes.get("entries");
            System.out.println("Veuillez entrer le numéro de l'entrée pour le menu n°" + i + " : " + entries);
            int num_entry_choose = scanner.nextInt();
            menu.add(entries.get(num_entry_choose));

            // Choix du plat principal
            Map<Integer, String> main_dishes = allDishes.get("main_dishes");
            System.out.println("Veuillez entrer le numéro du plat principal pour le menu n°" + i + " : " + main_dishes);
            int num_main_dish_choose = scanner.nextInt();
            menu.add(main_dishes.get(num_main_dish_choose));

            // Choix de l'accompagnement
            Map<Integer, String> side_dishes = allDishes.get("side_dishes");
            System.out.println("Veuillez entrer le numéro de l'accompagnement pour le menu n°" + i + " : " + side_dishes);
            int num_side_dish_choose = scanner.nextInt();
            menu.add(side_dishes.get(num_side_dish_choose));

            // Choix de la boisson
            Map<Integer, String> beverage = allDishes.get("beverage");
            System.out.println("Veuillez entrer le numéro de la boisson pour le menu n°" + i + " : " + beverage);
            int num_beverage_choose = scanner.nextInt();
            menu.add(beverage.get(num_beverage_choose));

            // Choix du dessert
            Map<Integer, String> desserts = allDishes.get("desserts");
            System.out.println("Veuillez entrer le numéro du dessert pour le menu n°" + i + " : " + desserts);
            int num_desserts_choose = scanner.nextInt();
            menu.add(desserts.get(num_desserts_choose));

            // Affichage du menu
            System.out.println("Menu n°" + i + " : " + menu + "\n");
        }

        scanner.close();
    }

    public static Map<String, Map<Integer, String>> creation_dishes() {
        Map<String, Map<Integer, String>> dishes = new HashMap<>();

        Map<Integer, String> entries = new HashMap<>();
        entries.put(1, "SALADE");
        entries.put(2, "SOUPE");
        entries.put(3, "QUICHE");
        entries.put(4, "AUCUNE");
        dishes.put("entries", entries);

        Map<Integer, String> main_dishes = new HashMap<>();
        main_dishes.put(1, "POULET");
        main_dishes.put(2, "BOEUF");
        main_dishes.put(3, "POISSON");
        main_dishes.put(4, "VEGETARIEN");
        main_dishes.put(5, "VEGAN");
        main_dishes.put(6, "AUCUN");
        dishes.put("main_dishes", main_dishes);

        Map<Integer, String> side_dishes = new HashMap<>();
        side_dishes.put(1, "RIZ");
        side_dishes.put(2, "PATES");
        side_dishes.put(3, "FRITES");
        side_dishes.put(4, "LEGUMES");
        side_dishes.put(5, "AUCUN");
        dishes.put("side_dishes", side_dishes);

        Map<Integer, String> beverage = new HashMap<>();
        beverage.put(1, "EAU PLATE");
        beverage.put(2, "EAU GAZEUSE");
        beverage.put(3, "SODA");
        beverage.put(4, "VIN");
        beverage.put(5, "AUCUNE");
        dishes.put("beverage", beverage);

        Map<Integer, String> desserts = new HashMap<>();
        desserts.put(1, "TARTE MAISON");
        desserts.put(2, "MOUSSE AU CHOCOLAT");
        desserts.put(3, "TIRAMISU");
        desserts.put(4, "AUCUN");
        dishes.put("desserts", desserts);

        return dishes;
    }
}
