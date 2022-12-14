abstract class People {
    protected String name;
    protected String mood="нейтральное";

    protected int hp=1000;
    protected Places location=Places.UNKOWN;

    public String getName() {
        return name;
    }
    public String getLocation(){
        return location.getTitle();
    }
    public String getMood(){
        return mood;
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
