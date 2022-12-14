public class Luis extends People implements LuisActions {
    public Luis() {
        name = "Льюис";
        location = Places.HOUSE;
        System.out.println("Персонаж " + name + " создан.");
    }


    public void stumbled(Subjects subjects) {
        switch (subjects) {
            case BONE -> {
                hp = hp - 50;
                System.out.println("hp " + name + " понизился");
            }
        }
    }

    @Override
    public void goOut(Places location2) {
        location = location2;
        System.out.println(name + " вышел из " + location.getTitle() + " и попал в " + location2.getTitle());
    }

    @Override
    public void see(People character) {
        System.out.println(name + " увидел " + character.getName() + ".");
    }

    @Override
    public void frightened() {
        System.out.println(name + " испугался.");
        mood = "испуганное";
    }

    @Override
    public void freeze() {
        System.out.println(name + " замер на месте.");
        mood = "напряженное";
    }

    @Override
    public void feel(Subjects subjects) {
        switch (subjects) {
            case NEEDLE -> {
                hp = hp - 50;
                System.out.println("hp понизился");
            }
            default -> {
                System.out.println(name + " почувствовал " + subjects.getTitle() + ".");
            }
        }
    }

    @Override
    public void go(Places location2, People character) {
        System.out.println(name + " идет в " + location2.getTitle() + " за " + character.getName());
        location = location2;
        character.location = location2;
    }

    @Override

    public void cling(Subjects subjects) {
        switch (subjects) {
            case THOUGHT -> {
                System.out.print(name + " цеплялся за " + subjects.getTitle() + ", что ");
            }
            default -> {
                System.out.println(name + " цеплялся за " + subjects.getTitle());
            }
        }
    }

    @Override
    public void be() {
        System.out.println(name + " сейчас " + location + ".");
    }

    @Override
    public void wince() {
        System.out.println(name + " поморщился.");
        mood = "подавленное";
    }
}


interface LuisActions {
    void goOut(Places location2);

    void see(People character);

    void frightened();

    void freeze();

    void feel(Subjects subjects);

    void go(Places location2, People character);

    void cling(Subjects subjects);

    void be();

    void wince();


}