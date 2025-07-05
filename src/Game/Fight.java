package Game;

import java.util.List;
import java.util.Random;

public class Fight {

    public void battle(List<? extends Character> light, List<? extends Character> dark) {

        Random random = new Random();
        int move = 1;
        boolean newMove = true;
        System.out.println("Бой между светлой и темной стороной начинается!");
        System.out.println();

        while (!light.isEmpty() && !dark.isEmpty()) {
            System.out.println(move + " ход!\n");

            int lightIndex = random.nextInt(light.size());
            int darkIndex = random.nextInt(dark.size());

            Character lightChar = light.get(lightIndex);
            Character darkChar = dark.get(darkIndex);

            if (random.nextBoolean()) {
                lightChar.makeMove(darkChar, light);
            } else {
                darkChar.makeMove(lightChar, dark);
            }

            if (lightChar.getHealthPoint() <= 0) {
                light.remove(lightIndex);
            }
            if (darkChar.getHealthPoint() <= 0) {
                dark.remove(darkIndex);
            }

            move++;

            if (light.isEmpty()) {
                System.out.println("Победила темная сторона!");
            } else if (dark.isEmpty()) {
                System.out.println("Победила светлая сторона!");
            }
        }

    }
}





