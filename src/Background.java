public class Background implements SubjectActions {
    @Override
    public void shrink(Subjects subjects, People person) {
        System.out.println(subjects.getTitle() + " " + person.getName() + " сжалось от ужаса.");
        person.mood = "очень испуганное";
    }

    @Override
    public void stickOut(Subjects subjects, People person) {

        switch (subjects) {
            case BONE -> {
                System.out.println(Subjects.BONE.getTitle() + " " + person.getName() + " торчит наружу.");
                person.hp = person.hp - 100;
                System.out.println("hp " + person.getName() + " понизился");
                person.mood = "полуживое";
            }
            default -> {
                System.out.println(subjects.getTitle() + " " + person.getName() + " торчит наружу.");
            }
        }

    }

    @Override
    public void pierce(Subjects subjects, People person) {
        System.out.println(subjects.getTitle() + " вонзилась в плечо " + person.getName() + ".");
        person.hp = person.hp - 100;
        System.out.println("hp " + person.getName() + " понизился");
        person.mood = "болезненное";
    }

    @Override
    public void dodge(Subjects something, Places location) {
        System.out.println(something.getTitle() + " петляла среди " + location.getTitle() + ".");
    }

    @Override
    public void stick(Subjects subjects, People person) {
        System.out.println(subjects.getTitle() + " липла к ступням " + person.getName() + ".");
        person.mood = "склизское";
    }

}

interface SubjectActions {
    void shrink(Subjects subjects, People person);

    void stickOut(Subjects subjects, People person);

    void pierce(Subjects subjects, People person);

    void dodge(Subjects something, Places location);


    void stick(Subjects subjects, People person);

}