package by.epam.javaintro.logic.task01;

import by.epam.javaintro.classes.task01.*;

public class CountryLogic {
    private Country country;

    public CountryLogic(Country country) {
        this.country = country;
    }

    public void printCapital() {
        country.getCapital().toString();
    }

    public void printNumOfRegs() {
        int num = country.getRegionList().size();
        System.out.println("Country " + country.getName() + "has " + num + "regions");
    }

    public void printSquare() {
        double sum = 0.0;
        for (int i = 0; i < country.getRegionList().size(); i++) {
            for (int j = 0; j < country.getRegionList().get(i).getDistList().size(); j++) {
                sum+=country.getRegionList().get(i).getDistList().get(j).getSquare();
            }
        }
        System.out.println("Total square of " + country.getName() + "is " + sum + "km^2");
    }

    public void printRegionCenters() {
        for (int i = 0; i < country.getRegionList().size(); i++) {
            System.out.println("The center of " + country.getRegionList().get(i).getName() +
                    "is" + country.getRegionList().get(i).getCenter().toString());
        }
    }
}
