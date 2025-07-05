package Game;


import java.util.ArrayList;


public class Game {

    public static void main(String[] args) {

        Fight fight = new Fight();

        ArrayList <Character> lightSides = new ArrayList<>();
        lightSides.add(new ElfWarrior("Ельф воин N1"));
        lightSides.add(new ElfWarrior("Ельф воин N2"));
        lightSides.add(new ElfWarrior("Ельф воин N3"));
        lightSides.add(new ElfWarrior("Ельф воин N4"));

        lightSides.add(new ElfArcher("Ельф лучник N1"));
        lightSides.add(new ElfArcher("Ельф лучник N2"));
        lightSides.add(new ElfArcher("Ельф лучник N3"));

        lightSides.add(new ElfMag("Ельф маг"));

        lightSides.add(new HumanWarrior("Человек воин N1"));
        lightSides.add(new HumanWarrior("Человек воин N2"));
        lightSides.add(new HumanWarrior("Человек воин N3"));
        lightSides.add(new HumanWarrior("Человек воин N4"));

        lightSides.add(new HumanArcher("Человек арбалетчик N1"));
        lightSides.add(new HumanArcher("Человек арбалетчик N2"));
        lightSides.add(new HumanArcher("Человек арбалетчик N3"));

        lightSides.add(new HumanMag("Человек маг"));

        ArrayList <Character> darkSides = new ArrayList<>();
        darkSides.add(new GoblinWarrior("Гоблин воин N1"));
        darkSides.add(new GoblinWarrior("Гоблин воин N2"));
        darkSides.add(new GoblinWarrior("Гоблин воин N3"));
        darkSides.add(new GoblinWarrior("Гоблин воин N4"));

        darkSides.add(new OrkArcher("Орк стрелок N1"));
        darkSides.add(new OrkArcher("Орк стрелок N2"));
        darkSides.add(new OrkArcher("Орк стрелок N3"));

        darkSides.add(new OrkShaman("Орк Шаман"));

        darkSides.add(new Zombie("Зомби N1"));
        darkSides.add(new Zombie("Зомби N2"));
        darkSides.add(new Zombie("Зомби N3"));
        darkSides.add(new Zombie("Зомби N4"));

        darkSides.add(new Hunter("Лучник нежети N1"));
        darkSides.add(new Hunter("Лучник нежети N2"));
        darkSides.add(new Hunter("Лучник нежети N3"));

        darkSides.add(new Necromant("Некромант нежити"));

       fight.battle(lightSides, darkSides);

    }
}