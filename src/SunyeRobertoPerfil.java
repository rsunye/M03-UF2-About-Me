import java.util.List;
import java.util.Random;

public class SunyeRobertoPerfil {
    private String name;
    private String story;
    private List<String> hobbies;
    private List<String> foods;
    private List<String> funFacts;

    public SunyeRobertoPerfil(String name, String story, List<String> hobbies, List<String> foods, List<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    public String getName() {
        return name;
    }

    public String getFormattedStory() {
        return "Mi Historia:\n" + story + "\n";
    }

    public String getFormattedHobbies() {
        String result = "Hobbies:\n";
        for (String hobby : hobbies) {
            result += "• " + hobby + "\n";
        }
        return result;
    }

    public String getFormattedFoods() {
        String result = "Comidas favoritas:\n";
        for (String food : foods) {
            result += "• " + food + "\n";
        }
        return result;
    }

    public String getRandomFunFact(Random random) {
        int index = random.nextInt(funFacts.size());
        return funFacts.get(index);
    }
}
