package by.epam.javaintro.logic.task04;

import by.epam.javaintro.classes.task04.*;

import java.util.Comparator;
import java.util.LinkedList;

public class TourLogic {
    private LinkedList<Tour> tours;
    private static Comparator<Tour> comparatorType = Comparator.comparing(obj -> obj.getType());
    private static Comparator<Tour> comparatorTransport = Comparator.comparing(obj -> obj.getTransport());
    private static Comparator<Tour> comparatorDays = Comparator.comparing(obj -> obj.getDaysAmount());

    public TourLogic(LinkedList<Tour> tours) {
        this.tours = tours;
    }

    public LinkedList<Tour> findTour(Tour.Type type, Tour.Transport transport, boolean food, int daysAmount) {
        Tour temp = new Tour(type, transport, food, daysAmount);
        LinkedList<Tour> result = new LinkedList<>();
        for (int i = 0; i < tours.size(); i++) {
            if(     temp.getType() == tours.get(i).getType() ||
                    temp.getTransport() == tours.get(i).getTransport() ||
                    temp.isFood() == tours.get(i).isFood() ||
                    temp.getDaysAmount() == tours.get(i).getDaysAmount()){
                result.add(tours.get(i));
            }
        }
        return result;
    }

    public LinkedList<Tour> sortByType() {
        tours.sort(comparatorType);
        return tours;
    }

    public LinkedList<Tour> sortByTransport() {
        tours.sort(comparatorTransport);
        return tours;
    }

    public LinkedList<Tour> sortByDays() {
        tours.sort(comparatorDays);
        return tours;
    }
}
