public class Pasko extends People implements PaskoActions {

    public Pasko() {
        name = "Паскоу";
        System.out.println("Персонаж " + name + " создан.");
    }

    @Override
    public void disappear() {
        System.out.println(name + " исчез.");
        location = Places.UNKOWN;
    }

    @Override
    public void look(People character) {
        System.out.println(name + " оглянулся на " + character);
    }

    @Override
    public void stay(Places location2) {
        System.out.println(name + " стоял на " + location2 + ".");
        location = location2;
    }
}

interface PaskoActions {
    void disappear();

    void look(People character);

    void stay(Places locations2);
}