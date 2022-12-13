public class Luis extends People implements LuisActions {
    public Luis() {
        name = "Льюис";
        places = Places.GARAGE;
        System.out.println("Персонаж " + name + " создан.");
    }

    @Override
    public void goOut() {
        System.out.println(name + " вышел из " + places.getTitle() + ".");
    }

    @Override
    public void see(Pasko pasko) {
        System.out.println(name + " увидел " + pasko.getName() + ".");
    }

    @Override
    public void frightened() {
        System.out.println(name + " испугался.");
    }

    @Override
    public void freeze() {
        System.out.println(name + " замер на месте.");
    }

    @Override
    public void feel() {
        System.out.println(name + " почувствовал " + Subjects.NEEDLE.getTitle() + ".");
    }

    @Override
    public void go() {
        System.out.println(name + " идет в " + Places.FOREST.getTitle() + ".");
    }

    @Override

    public void cling(String think) {
        System.out.println(name + " цеплялся за " + Subjects.THOUGHT.getTitle() + ", что " + think);
    }

    @Override
    public void be() {
        System.out.println(name + " сейчас " + Places.HOUSE.getTitle() + ".");
    }

    @Override
    public void wince() {
        System.out.println(name + " поморщился.");
    }
}

interface LuisActions {
    public void goOut();

    public void see(Pasko pasko);

    public void frightened();

    public void freeze();

    public void feel();

    public void go();

    public void cling(String think);

    public void be();

    public void wince();


}