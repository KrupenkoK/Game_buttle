package Game;

import Game.*;

import java.util.ArrayList;
import java.util.Random;

public class Fight {

    protected void battle(ArrayList light, ArrayList dark) {
        Random random = new Random();
        int move = 1;
        boolean newMove = true;
        System.out.println("Бой между светлой и темной стороной начинается!");
        System.out.println();

        OUTER: while(!light.isEmpty() && !dark.isEmpty()) {

            if (newMove) {
                System.out.println(move + " ход!");
                System.out.println();
            }

            int lightSideIndex = random.nextInt(light.size());
            int darkSideIndex = random.nextInt(dark.size());

            Character lightSide = (Character) light.get(lightSideIndex);
            Character darkSide = (Character) dark.get(darkSideIndex);


            if (random.nextBoolean()) {
                if(lightSide instanceof ElfWarrior)  {
                    ElfWarrior elfWarrior = (ElfWarrior) lightSide;
                    elfWarrior.hit(darkSide);
                    newMove = true;
                } else if (lightSide instanceof ElfMag) {
                    ElfMag elfMag = (ElfMag) lightSide;
                    if (random.nextBoolean() && !lightSide.isProtect()) {
                        elfMag.buff(lightSide);
                    } else {
                        elfMag.rangeHit(darkSide);
                    }
                    newMove = true;
                } else if (lightSide instanceof ElfArcher) {
                    ElfArcher elfArcher = (ElfArcher) lightSide;
                    if (random.nextBoolean()) {
                        elfArcher.hit(darkSide);
                    } else {
                        elfArcher.rangeHit(darkSide);
                    }
                    newMove = true;
                } else if (lightSide instanceof HumanWarrior) {
                    HumanWarrior humanWarrior = (HumanWarrior) lightSide;
                    humanWarrior.hit(darkSide);
                    newMove = true;
                } else if (lightSide instanceof HumanArcher) {
                    HumanArcher humanArcher = (HumanArcher) lightSide;
                    if (random.nextBoolean()) {
                        humanArcher.hit(darkSide);
                    } else {
                        humanArcher.rangeHit(darkSide);
                    }
                    newMove = true;
                } else if (lightSide instanceof HumanMag) {
                    HumanMag humanMag = (HumanMag) lightSide;
                    if (random.nextBoolean() && !lightSide.isProtect()) {
                        humanMag.buff(lightSide);
                    } else {
                        humanMag.hit(darkSide);
                    }
                    newMove = true;
                }
            }
            else {
                if (darkSide instanceof GoblinWarrior) {
                    GoblinWarrior goblinWarrior = (GoblinWarrior) darkSide;
                    goblinWarrior.hit(lightSide);
                    newMove = true;
                } else if (darkSide instanceof OrkShaman) {
                    OrkShaman orkShaman = (OrkShaman) darkSide;
                    if (random.nextBoolean() && !darkSide.isProtect()) {
                        orkShaman.buff(darkSide);
                    } else if (random.nextBoolean() && lightSide.isProtect()) {
                        orkShaman.deBuff(lightSide);
                    } else {
                        newMove = false;
                        continue OUTER;
                    }
                } else if (darkSide instanceof OrkArcher) {
                    OrkArcher orkArcher = (OrkArcher) darkSide;
                    if (random.nextBoolean()) {
                        orkArcher.hit(lightSide);
                    } else {
                        orkArcher.rangeHit(lightSide);
                    }
                    newMove = true;
                } else if (darkSide instanceof Zombie) {
                    Zombie zombie = (Zombie) darkSide;
                    zombie.hit(lightSide);
                    newMove = true;
                } else if (darkSide instanceof Hunter) {
                    Hunter hunter = (Hunter) darkSide;
                    boolean random2 = new Random().nextBoolean();
                    if (random2) {
                        hunter.hit(lightSide);
                    } else {
                        hunter.rangeHit(lightSide);
                    }
                    newMove = true;
                } else if (darkSide instanceof Necromant) {
                    Necromant necromant = (Necromant) darkSide;
                    if (random.nextBoolean()) {
                        if (!lightSide.isWeakened()) {
                            necromant.ailments(lightSide);
                        }
                        else {
                            necromant.hit(lightSide);
                        }
                    } else {
                        necromant.hit(lightSide);
                    }
                    newMove = true;
                }
            }

            if(lightSide.getHealthPoint() <= 0) {
                light.remove(lightSideIndex);
            } else if (darkSide.getHealthPoint() <= 0) {
                dark.remove(darkSideIndex);
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





