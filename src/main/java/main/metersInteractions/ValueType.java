package main.metersInteractions;

public enum ValueType {

    COLDWATER("Холодная вода"),
    HOTWATER("Горячая вода"),
    HEATING("Отопление"),
    ELECTRICITYDAY("Электричество/день"),
    ELECTRICITYNIGHT("Электричество/ночь");

    private String name;

    ValueType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
