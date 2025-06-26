package Game;

public abstract class Character  {
    private int healthPoint ;
    private boolean protect;
    private boolean weakened;
    private String name;


    public Character (String name) {
        healthPoint = 100;
        protect = false;
        weakened = false;
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int hit) {
        this.healthPoint -= hit;
    }

    public boolean isProtect() {
        return protect;
    }

    public void setProtect(boolean protect) {
        this.protect = protect;
    }

    public boolean isWeakened() {
        return weakened;
    }

    public void setWeakened(boolean weakened) {
        this.weakened = weakened;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class ElfWarrior extends Character implements Hit {

    public ElfWarrior(String name) {
        super(name);
    }

    public int hit(Character ch) {

        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " наносит удар мечем по " + ch.getName() + " но защита защищает");
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect() && !this.isWeakened()) {
            System.out.println(getName() + " наносит удар мечем 15 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(15);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else { System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        } else if (!ch.isProtect() && this.isWeakened()) {
            System.out.println(getName() + " наносит удар мечем 7 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(7);
            this.setWeakened(false);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else { System.out.println("У " + ch.getName()+ " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}

class ElfMag extends Character implements Buff, RangeHit {

    public ElfMag(String name) {
        super(name);
    }

    public boolean buff(Character ch) {

        if (!ch.isProtect() && ch.getHealthPoint() > 0) {
            ch.setProtect(true);
            System.out.println(getName() + " дает защиту: " + ch.getName());
        }
        System.out.println();
        return ch.isProtect();
    }

    public int rangeHit(Character ch) {

        if (ch.isProtect()) {
            System.out.println(getName() + " наносит удар магией по " + ch.getName() + " но защита защищает");
            ch.setProtect(false);
            System.out.println("У " + ch.getName() + " -  " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect() && !this.isWeakened()) {
            System.out.println(getName() + " наносит удар магией 10 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(10);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        } else if (!ch.isProtect() && this.isWeakened()) {
            System.out.println(getName() + " наносит удар магией 5 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(5);
            this.setWeakened(false);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}

class ElfArcher extends Character implements RangeHit, Hit {

    public ElfArcher(String name) {
        super(name);
    }

    public int hit(Character ch) {
        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " наносит удар по " + ch.getName()  + " но защита защищает");
            System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect() && !this.isWeakened()) {
            System.out.println(getName()  + " наносит удар 3 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(3);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");}
        } else if (!ch.isProtect() && this.isWeakened()) {
            System.out.println(getName()  + " наносит удар 2 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(2);
            this.setWeakened(false);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }

    public int rangeHit(Character ch) {
        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " стреляет по " + ch.getName() + " но защита защищает");
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect() && !this.isWeakened()) {
            System.out.println(getName() + " стреляет 7 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(7);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        } else if (!ch.isProtect() && this.isWeakened()) {
            System.out.println(getName() + " стреляет 4 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(4);
            this.setWeakened(false);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}

class HumanWarrior extends Character implements Hit {

    public HumanWarrior(String name) {
        super(name);
    }

    public int hit(Character ch) {

        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " наносит удар мечем по " + ch.getName() + " но защита защищает");
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect() && !this.isWeakened()) {
            System.out.println(getName() + " наносит удар мечем 18 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(18);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else { System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        } else if (!ch.isProtect() && this.isWeakened()) {
            System.out.println(getName() + " наносит удар мечем 9 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(9);
            this.setWeakened(false);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else { System.out.println("У " + ch.getName()+ " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}

class HumanArcher extends Character implements Hit, RangeHit {

    public HumanArcher(String name) {
        super(name);
    }

    public int hit(Character ch) {
        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " наносит удар по " + ch.getName()  + " но защита защищает");
            System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect() && !this.isWeakened()) {
            System.out.println(getName()  + " наносит удар 3 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(3);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");}
        } else if (!ch.isProtect() && this.isWeakened()) {
            System.out.println(getName()  + " наносит удар 2 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(2);
            this.setWeakened(false);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }

    public int rangeHit(Character ch) {
        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " стреляет по " + ch.getName() + " но защита защищает");
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect() && !this.isWeakened()) {
            System.out.println(getName() + " стреляет 5 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(5);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        } else if (!ch.isProtect() && this.isWeakened()) {
            System.out.println(getName() + " стреляет 3 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(3);
            this.setWeakened(false);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}

class HumanMag extends Character implements Buff, Hit {

    public HumanMag(String name) {
        super(name);
    }

    public boolean buff(Character ch) {

        if (!ch.isProtect() && ch.getHealthPoint() > 0) {
            ch.setProtect(true);
            System.out.println(getName() + " дает защиту: " + ch.getName());
        }
        System.out.println();
        return ch.isProtect();
    }

    public int hit(Character ch) {

        if (ch.isProtect()) {
            System.out.println(getName() + " наносит удар магией по " + ch.getName() + " но защита защищает");
            ch.setProtect(false);
            System.out.println("У " + ch.getName() + " -  " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect() && !this.isWeakened()) {
            System.out.println(getName() + " наносит удар магией 4 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(4);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        } else if (!ch.isProtect() && this.isWeakened()) {
            System.out.println(getName() + " наносит удар магией 2 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(2);
            this.setWeakened(false);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}


class GoblinWarrior extends Character implements Hit {

    public GoblinWarrior(String name) {
        super(name);
    }

    public int hit(Character ch) {

        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " наносит удар дубиной по " + ch.getName() + " но защита защищает");
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect()) {
            System.out.println(getName()  + " наносит удар дубиной 20 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(20);
            if (ch.getHealthPoint() <= 0) {
                System.out.println(ch.getName() + " погиб!");
            }
            else {
                System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            }
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}


class OrkShaman extends Character implements Buff, DeBuff {

    public OrkShaman(String name) {
        super(name);
    }

    public boolean buff(Character ch) {
        if (!ch.isProtect() && ch.getHealthPoint() > 0) {
            ch.setProtect(true);
            System.out.println(getName() + " дает защиту: " + ch.getName());
        }
        System.out.println();
        return ch.isProtect();
    }

    public boolean deBuff(Character ch) {
        if (ch.isProtect() && ch.getHealthPoint() > 0) {
            ch.setProtect(false);
            System.out.println(getName() +" снимает защиту: " + ch.getName());
        }
        System.out.println();
        return ch.isProtect();
    }
}


class OrkArcher extends Character implements RangeHit, Hit {

    public OrkArcher(String name) {
        super(name);
    }

    public int hit(Character ch) {
        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " наносит удар клинком по " + ch.getName()  + " но защита защищает");
            System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect()) {
            System.out.println(getName()  + " наносит удар клинком 2 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(2);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else {System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }

    public int rangeHit(Character ch) {
        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " стреляет по " + ch.getName() + " но защита защищает");
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect()) {
            System.out.println(getName() + " стреляет 3 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(3);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}


class Zombie extends Character implements Hit {

    public Zombie(String name) {
        super(name);
    }

    public int hit(Character ch) {

        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " наносит удар копьем по " + ch.getName() + " но защита защищает");
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect()) {
            System.out.println(getName()  + " наносит удар копьем 18 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(18);
            if (ch.getHealthPoint() <= 0) {
                System.out.println(ch.getName() + " погиб!");
            }
            else {
                System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            }
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}

class Hunter extends Character implements RangeHit, Hit {

    public Hunter(String name) {
        super(name);
    }

    public int hit(Character ch) {
        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " наносит удар клинком по " + ch.getName()  + " но защита защищает");
            System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect()) {
            System.out.println(getName()  + " наносит удар клинком 2 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(2);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName()  + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }

    public int rangeHit(Character ch) {
        if (ch.isProtect()) {
            ch.setProtect(false);
            System.out.println(getName() + " стреляет по " + ch.getName() + " но защита защищает");
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect()) {
            System.out.println(getName() + " стреляет 4 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(4);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}

class Necromant extends Character implements Hit, Ailments {

    public Necromant(String name) {
        super(name);
    }

    public boolean ailments(Character ch) {
        if (ch.getHealthPoint() > 0  && !ch.isWeakened()) {
            ch.setWeakened(true);
            System.out.println(getName() + " ослабляет: " + ch.getName() + " на 50% нанесения урона на следующий его ход");
        }
        System.out.println();
        return ch.isWeakened();
    }

    public int hit(Character ch) {
        if (ch.isProtect()) {
            System.out.println(getName() + " наносит удар по " + ch.getName() + " но защита защищает");
            ch.setProtect(false);
            System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
        } else if (!ch.isProtect()) {
            System.out.println(getName() + " наносит удар 5 по " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");
            ch.setHealthPoint(5);
            if (ch.getHealthPoint() <= 0) { System.out.println(ch.getName() + " погиб!");}
            else {System.out.println("У " + ch.getName() + " - " + ch.getHealthPoint() + " жизней");}
        }
        System.out.println();
        return ch.getHealthPoint();
    }
}


interface Buff { boolean buff(Character ch);}

interface DeBuff { boolean deBuff(Character ch);}

interface Ailments { boolean ailments(Character ch);}

interface RangeHit {int rangeHit(Character ch);}

interface Hit { int hit(Character ch);}


