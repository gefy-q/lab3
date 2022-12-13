public enum Subjects {

    PATH("тропинка"),
    BRANCH("ветка"),
    HEART("сердце"),
    BONE("кость"),
    NEEDLE("иглы"),
    GOUND("земля"),
    THOUGHT("мысль");

    private String title;

    Subjects(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

