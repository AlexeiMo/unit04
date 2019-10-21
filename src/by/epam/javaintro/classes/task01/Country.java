package by.epam.javaintro.classes.task01;

import java.util.LinkedList;
import java.util.Objects;

public class Country {
    private String name;
    private Town capital;
    private LinkedList<Region> regionList;

    public Country() {
        this.name = "Unnamed country";
        this.capital = new Town("Unnamed city");
        this.regionList = new LinkedList<>();
    }

    public Country(String name, double square, Town capital, LinkedList<Region> regionList) {
        this.name = name;
        this.capital = capital;
        this.regionList = regionList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(Town capital) {
        this.capital = capital;
    }

    public void setRegionList(LinkedList<Region> regionList) {
        this.regionList = new LinkedList<>();
        for (int i = 0; i < regionList.size() ; i++) {
            this.regionList.add(regionList.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public Town getCapital() {
        return capital;
    }

    public LinkedList<Region> getRegionList() {
        return regionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(regionList, country.regionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, regionList);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", regionList=" + regionList +
                '}';
    }
}
