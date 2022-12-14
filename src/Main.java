public class Main {
    public static void main(String[] args) {
        Pasko pasko = new Pasko();
        Luis luis = new Luis();
        Background background = new Background();
        pasko.disappear();
        luis.goOut(Places.FOREST);
        System.out.println("Локация Льюиса сейчас " + luis.getLocation());
        System.out.println("Настроение Льюиса сейчас " + luis.getMood());
        luis.goOut(Places.LAWN);
        luis.see(pasko);
        pasko.stay(Places.LAWN);
        luis.frightened();
        System.out.println("Настроение Льюиса сейчас " + luis.getMood());
        luis.freeze();
        pasko.look(luis);
        background.shrink(Subjects.HEART, luis);
        background.stickOut(Subjects.BONE, pasko);
        luis.goOut(Places.HOUSE);
        luis.feel(Subjects.NEEDLE);
        luis.go(Places.FOREST, pasko);
        System.out.println("Локация Льюиса сейчас " + luis.getLocation());
        System.out.println("Локация Паско сейчас " + pasko.getLocation());
        background.pierce(Subjects.BRANCH, luis);
        System.out.println("Настроение Льюиса сейчас " + luis.getMood());
        luis.frightened();
        background.dodge(Subjects.PATH, Places.TREES);
        background.stick(Subjects.GOUND, luis);
        System.out.println("Настроение Льюиса сейчас " + luis.getMood());
        luis.cling(Subjects.THOUGHT);
        System.out.println("это все-таки сон.");
    }
}
