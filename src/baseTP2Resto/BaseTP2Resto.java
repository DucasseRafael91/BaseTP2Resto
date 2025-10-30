package baseTP2Resto;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BaseTP2Resto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		Map<Integer, String> entries = new HashMap<>();
		entries.put(1, "SALADE");
		entries.put(2, "SOUPE");
		entries.put(3, "QUICHE");
		entries.put(4, "AUCUNE");
		
		Map<Integer, String> main_dishes = new HashMap<>();
		main_dishes.put(1, "POULET");
		main_dishes.put(2, "BOEUF");
		main_dishes.put(3, "POISSON");
		main_dishes.put(4, "VEGETARIEN");
		main_dishes.put(5, "VEGAN");
		main_dishes.put(6, "AUCUN");
		
		Map<Integer, String> side_dishes = new HashMap<>();
		side_dishes.put(1, "RIZ");
		side_dishes.put(2, "PATES");
		side_dishes.put(3, "FRITES");
		side_dishes.put(4, "LEGUMES");
		side_dishes.put(5, "AUCUN");
		
		Map<Integer, String> beverage = new HashMap<>();
		beverage.put(1, "EAU PLATE");
		beverage.put(2, "EAU GAZEUZE");
		beverage.put(3, "SODA");
		beverage.put(4, "VIN");
		beverage.put(5, "AUCUNE");
		
		Map<Integer, String> desserts = new HashMap<>();
		desserts.put(1, "TARTE MAISON");
		desserts.put(2, "MOUSSE AU CHOCOLAT");
		desserts.put(3, "TIRAMISU");
		desserts.put(4, "AUCUN");

        System.out.println("Bonjour, combien de menus souhaitez-vous ?");
        int number_of_menus = scanner.nextInt();
        scanner.nextLine();

        // Boucle pour chaque commande
        for (int i = 1; i <= number_of_menus; i++) {
        	List<String> menu = new ArrayList<>();
        	
        	//Choix de l'entrée
            System.out.println("Veuillez entrer le numéro de l'entrée pour le menu n°" + i + " : " + entries);
            int num_entry_choose = scanner.nextInt();
            String entry_choose = entries.get(num_entry_choose);
            menu.add(entry_choose);
            
        	//Choix de du plat principal
            System.out.println("Veuillez entrer le numéro du plat principal pour le menu n°" + i + " : " + main_dishes);
            int num_main_dish_choose = scanner.nextInt();
            String main_dish_choose = main_dishes.get(num_main_dish_choose);
            menu.add(main_dish_choose);
            
        	//Choix de l'accompagnement
            System.out.println("Veuillez entrer le numéro de l'accompagnement pour le menu n°" + i + " : " + side_dishes);
            int num_side_dish_choose = scanner.nextInt();
            String side_dish_choose = side_dishes.get(num_side_dish_choose);
            menu.add(side_dish_choose);
            
        	//Choix de la boisson
            System.out.println("Veuillez entrer le numéro de la boisson pour le menu n°" + i + " : " + beverage);
            int num_beverage_choose = scanner.nextInt();
            String beverage_choose = beverage.get(num_beverage_choose);
            menu.add(beverage_choose);
            
        	//Choix du dessert
            System.out.println("Veuillez entrer le numéro de l'entrée pour le menu n°" + i + " : " + desserts);
            int num_desserts_choose = scanner.nextInt();
            String desserts_choose = desserts.get(num_desserts_choose);
            menu.add(desserts_choose);
            
            //Affichage du menu
            System.out.println(menu);

            
            
        }
        scanner.close();
    }


}
