//4. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
//типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
//транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

package by.epam.javaintro.classes.task04;

import java.util.Objects;

public class Tour {
    private Type type;
    private Transport transport;
    private boolean food;
    private int daysAmount;

    public Tour() {
        this.type = Type.NOT_SELECTED;
        this.transport = Transport.NOT_SELECTED;
        this.food = false;
        this.daysAmount = 0;
    }

    public Tour(Type type, Transport transport, boolean food, int daysAmount) {
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.setDaysAmount(daysAmount);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getDaysAmount() {
        return daysAmount;
    }

    public void setDaysAmount(int daysAmount) {
        if(daysAmount >= 5 && daysAmount <= 60) {
            this.daysAmount = daysAmount;
        }
        else {
            this.daysAmount = 5;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return food == tour.food &&
                daysAmount == tour.daysAmount &&
                type == tour.type &&
                transport == tour.transport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, transport, food, daysAmount);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "type=" + type +
                ", transport=" + transport +
                ", food=" + food +
                ", daysAmount=" + daysAmount +
                '}';
    }

    public enum Type{
        RECREATION,
        EXCURSION,
        TREATMENT,
        SHOPING,
        CRUISE,
        NOT_SELECTED
    }
    public enum Transport{
        BUS,
        TRAIN,
        PLAIN,
        SHIP,
        NOT_SELECTED
    }
}
