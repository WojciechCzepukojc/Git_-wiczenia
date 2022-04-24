package pl.sda.arppl.pracawzespole.polefigur;

public enum FigureType {
    TRIANGLE("triangle"), HEXAGON("hexagon");
    private String name;

    FigureType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
