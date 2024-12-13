import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SunyeRobertoMain {
    public static void main(String[] args) {

        List<String> hobbies = List.of("Escalada 🧗", "Música 🎶", "Baloncesto 🏀");
        List<String> foods = List.of("Ramen 🍜", "Queso 🧀", "Hamburguesa 🍔");
        List<String> funFacts = List.of("Se tocar Smoke on the water con la guitarra 🎸",
                "Soy fanático de las cosas relacionadas con zombies 🧟‍♂️",
                "Tengo una colección de más de 300 Nerf 🔫");

        SunyeRobertoPerfil perfil = new SunyeRobertoPerfil("Roberto Sunyé",
                "Soy un chico de 37 años, me gusta el mundo de la informática y me gustaría en algún momento llegar a trabajar de ello. .",
                hobbies,
                foods,
                funFacts);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int option = 0;

        while (option != 4) {
            System.out.println("\n-Menu Sobre mi- [" + perfil.getName() + "]");
            System.out.println("1. Mi Historia.");
            System.out.println("2. Favoritos.");
            System.out.println("3. Datos curiosos.");
            System.out.println("4. Salir.");
            System.out.print("Selecciona una opción: ");

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                option = -1;
            }

            switch (option) {
                case 1:
                    System.out.println(perfil.getFormattedStory());
                    break;
                case 2:
                    System.out.println(perfil.getFormattedHobbies());
                    System.out.println(perfil.getFormattedFoods());
                    break;
                case 3:
                    System.out.println("Dato curioso:");
                    System.out.println("* " + perfil.getRandomFunFact(random));
                    break;
                case 4:
                    System.out.println("Saliendo del progama.");
                    break;
                default:
                    System.out.println("Opción invalida. Introduce un valor válido.");
            }
        }

        scanner.close();
    }
}