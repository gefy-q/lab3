public enum Places {

    GARAGE("Гараж"),
    LAWN("Лужайка"),
    HOUSE("Дом"),
    BED("Постель"),
    HILL("Холм"),
    TREES("Деревья"),
    FOREST("Подлесок"),
    UNKOWN("Неизвестно");

    private String title;

    Places(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

abstract class Location{
    String getPlace(Places places) {
        return places.getTitle();
    }
}