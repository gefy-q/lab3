public class Pasko extends People implements PaskoActions {

    public Pasko() {
        name = "Паскоу";
        places = Places.LAWN;
        System.out.println("Персонаж " + name + " создан.");
    }

    @Override
    public void disappear() {
        System.out.println(name + " исчез.");
    }

    @Override
    public void look() {
        System.out.println(name + " оглянулся.");
    }

    @Override
    public void stay() {
        System.out.println(name + " стоял на " + places.getTitle() + ".");
    }
}

interface PaskoActions {
    public void disappear();

    public void look();

    public void stay();
}