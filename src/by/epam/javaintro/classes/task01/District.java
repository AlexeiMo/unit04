package by.epam.javaintro.classes.task01;

import java.util.LinkedList;
import java.util.Objects;

public class District {
    private String name;
    private double square;
    private LinkedList<Town>  townList;

    public District(String name, double square, LinkedList<Town> townList) {
        this.name = name;
        this.square = square;
        this.townList = new LinkedList<>();
        setTownList(townList);
    }

    public District() {
        this.name = "Unnamed district";
        this.square = 0.0;
        this.townList = new LinkedList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setTownList(LinkedList<Town> townList) {
        for (int i = 0; i < townList.size(); i++) {
            this.townList.add(townList.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public LinkedList<Town> getTownList() {
        return townList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.square, square) == 0 &&
                Objects.equals(name, district.name) &&
                Objects.equals(townList, district.townList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square, townList);
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", townList=" + townList +
                '}';
    }
}
