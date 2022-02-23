import java.util.Random;

public class ServerNameGenerator {

    static String[] adjectives = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "annoying", "anxious", "arrogant", "ashamed", "attractive", "average", "awful", "bad", "beautiful"};

    static String[] nouns = {"Actor", "Gold", "Painting", "Advertisement", "Grass", "Parrot", "Afternoon", "Greece", "Pencil", "Airport", "Guitar", "Piano", "Ambulance", "Hair", "Pillow", "Animal", "Hamburger", "Pizza"};

    public static void getRandom() {

        Random random = new Random();
        int rnd1 = random.nextInt(adjectives.length);
        int rnd2 = new Random().nextInt(nouns.length);
        System.out.println(adjectives[rnd1] + "-" + nouns[rnd2]);

    }

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        getRandom();

    }
}
