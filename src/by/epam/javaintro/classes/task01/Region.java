package by.epam.javaintro.classes.task01;

import java.util.LinkedList;
import java.util.Objects;

public class Region {
    private String name;
    private Town center;
    private LinkedList<District> distList;

    public Region() {
        this.name = "Unnamed region";
        this.center = new Town("Unnamed city");
        this.distList = new LinkedList<>();
    }

    public Region(String name, double square, Town center, LinkedList<District> distList) {
        this.name = name;
        this.center = center;
        this.distList = new LinkedList<>();
        setDistList(distList);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCenter(Town center) {
        this.center = center;
    }

    public void setDistList(LinkedList<District> distList) {
        for (int i = 0; i < distList.size(); i++) {
            this.distList.add(distList.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public Town getCenter() {
        return center;
    }

    public LinkedList<District> getDistList() {
        return distList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return  Objects.equals(name, region.name) &&
                Objects.equals(center, region.center) &&
                Objects.equals(distList, region.distList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, center, distList);
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", center=" + center +
                ", distList=" + distList +
                '}';
    }
}
