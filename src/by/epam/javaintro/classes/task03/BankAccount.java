package by.epam.javaintro.classes.task03;

import java.util.Objects;

public class BankAccount {
    private String name;
    private double money;
    private boolean block;

    public BankAccount() {
        this.name = "unnamed account";
        this.money = 0.0;
        this.block = false;
    }

    public BankAccount(String name, double money, boolean block) {
        this.name = name;
        this.money = money;
        this.block = block;
    }

    public String getName() {
        return isBlock()?"Account is blocked":name;
    }

    public void setName(String name) {
        if(isBlock()) {
            System.out.println("Cannot change. Account is blocked");
            return;
        }
        this.name = name;
    }

    public double getMoney() {
        if(isBlock()) {
            System.out.println("Account is blocked");
            return 0.0;
        }
        return money;
    }

    public void setMoney(double money) {
        if(isBlock()) {
            System.out.println("Cannot change. Account is blocked");
            return;
        }
        this.money = money;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.money, money) == 0 &&
                block == that.block &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, block);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", block=" + block +
                '}';
    }
}
