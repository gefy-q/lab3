public class Main {
    public static void main(String[] args) {
        String think = "это все-таки сон.";
        Pasko pasko = new Pasko();
        Luis luis = new Luis();
        Background background = new Background();
        pasko.disappear();
        luis.goOut();
        luis.see(pasko);
        pasko.stay();
        luis.frightened();
        luis.freeze();
        pasko.look();
        background.shrink(luis.getName());
        background.stickOut(pasko.getName());
        luis.goOut();
        luis.feel();
        luis.be();
        background.pierce(luis.getName());
        luis.wince();
        luis.frightened();
        background.dodge();
        background.dive();
        background.stick(luis.getName());
        background.rush(luis.getName());
        luis.cling(think);
    }
}


abstract class People {
    protected String name;
    protected Places places;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Персонаж " + this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

}












