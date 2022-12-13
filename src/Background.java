public class Background implements SubjectActions {
    @Override
    public void shrink(String person) {
        System.out.println(Subjects.HEART.getTitle() + " " + person + " сжалось от ужаса.");
    }

    @Override
    public void stickOut(String person) {
        System.out.println(Subjects.BONE.getTitle() + " " + person + " торчит наружу.");
    }

    @Override
    public void pierce(String person) {
        System.out.println(Subjects.BRANCH.getTitle() + " вонзилась в плечо " + person + ".");
    }

    @Override
    public void dodge() {
        System.out.println(Subjects.PATH.getTitle() + " петляла среди " + Places.TREES.getTitle() + ".");
    }

    @Override
    public void dive() {
        System.out.println(Subjects.PATH.getTitle() + " нырнула в " + Places.FOREST.getTitle() + ".");
    }

    @Override
    public void stick(String person) {
        System.out.println(Subjects.GOUND.getTitle() + " липла к ступням " + person + ".");
    }

    @Override
    public void rush(String person) {
        System.out.println(Subjects.THOUGHT.getTitle() + " пронеслась в голове " + person + ".");
    }
}

interface SubjectActions {
    public void shrink(String person);

    public void stickOut(String person);

    public void pierce(String person);

    public void dodge();

    public void dive();

    public void stick(String person);

    public void rush(String person);
}