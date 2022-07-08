import java.util.Random;

public class DiceRoller {
    int number = 0;
    Random random;

    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    };

}
