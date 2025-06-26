package Game;


import java.util.ArrayList;


public class Game {

    public static void main(String[] args) {

        Fight fight = new Fight();

        ElfWarrior elfWarrior1 = new ElfWarrior("Ельф воин N1");
        ElfWarrior elfWarrior2 = new ElfWarrior("Ельф воин N2");
        ElfWarrior elfWarrior3 = new ElfWarrior("Ельф воин N3");
        ElfWarrior elfWarrior4 = new ElfWarrior("Ельф воин N4");

        ElfArcher elfArcher1 = new ElfArcher("Ельф лучник N1");
        ElfArcher elfArcher2 = new ElfArcher("Ельф лучник N2");
        ElfArcher elfArcher3 = new ElfArcher("Ельф лучник N3");

        ElfMag elfMag = new ElfMag("Ельф маг");


        HumanWarrior humanWarrior1 = new HumanWarrior("Человек воин N1");
        HumanWarrior humanWarrior2 = new HumanWarrior("Человек воин N2");
        HumanWarrior humanWarrior3 = new HumanWarrior("Человек воин N3");
        HumanWarrior humanWarrior4 = new HumanWarrior("Человек воин N4");

        HumanArcher humanArcher1 = new HumanArcher("Человек арбалетчик N1");
        HumanArcher humanArcher2 = new HumanArcher("Человек арбалетчик N2");
        HumanArcher humanArcher3 = new HumanArcher("Человек арбалетчик N3");

        HumanMag humanMag = new HumanMag("Человек маг");

        GoblinWarrior goblinWarrior1 = new GoblinWarrior("Гоблин воин N1");
        GoblinWarrior goblinWarrior2 = new GoblinWarrior("Гоблин воин N2");
        GoblinWarrior goblinWarrior3 = new GoblinWarrior("Гоблин воин N3");
        GoblinWarrior goblinWarrior4 = new GoblinWarrior("Гоблин воин N4");

        OrkArcher orkArcher1 = new OrkArcher("Орк стрелок N1");
        OrkArcher orkArcher2 = new OrkArcher("Орк стрелок N2");
        OrkArcher orkArcher3 = new OrkArcher("Орк стрелок N3");

        OrkShaman orkShaman = new OrkShaman("Орк Шаман");


        Zombie zombie1 = new Zombie("Зомби N1");
        Zombie zombie2 = new Zombie("Зомби N2");
        Zombie zombie3 = new Zombie("Зомби N3");
        Zombie zombie4 = new Zombie("Зомби N4");

        Hunter hunter1 = new Hunter("Лучник нежети N1");
        Hunter hunter2 = new Hunter("Лучник нежети N2");
        Hunter hunter3 = new Hunter("Лучник нежети N3");

        Necromant necromant = new Necromant("Некромант нежити");


        ArrayList <Character> lightSides = new ArrayList<>();
        lightSides.add(elfWarrior1);
        lightSides.add(elfWarrior2);
        lightSides.add(elfWarrior3);
        lightSides.add(elfWarrior4);

        lightSides.add(elfArcher1);
        lightSides.add(elfArcher2);
        lightSides.add(elfArcher3);

        lightSides.add(elfMag);

        lightSides.add(humanWarrior1);
        lightSides.add(humanWarrior2);
        lightSides.add(humanWarrior3);
        lightSides.add(humanWarrior4);

        lightSides.add(humanArcher1);
        lightSides.add(humanArcher2);
        lightSides.add(humanArcher3);

        lightSides.add(humanMag);

        ArrayList <Character> darkSides = new ArrayList<>();
        darkSides.add(goblinWarrior1);
        darkSides.add(goblinWarrior2);
        darkSides.add(goblinWarrior3);
        darkSides.add(goblinWarrior4);

        darkSides.add(orkArcher1);
        darkSides.add(orkArcher2);
        darkSides.add(orkArcher3);

        darkSides.add(orkShaman);

        darkSides.add(zombie1);
        darkSides.add(zombie2);
        darkSides.add(zombie3);
        darkSides.add(zombie4);

        darkSides.add(hunter1);
        darkSides.add(hunter2);
        darkSides.add(hunter3);

        darkSides.add(necromant);

       fight.battle(lightSides, darkSides);

    }
}