package by.epam.javaintro.logic.task03;

import by.epam.javaintro.classes.task03.*;
import java.util.Comparator;

public class ClientLogic {
    private Client client;
    private static Comparator<BankAccount> comparatorName = Comparator.comparing(obj -> obj.getName());
    private static Comparator<BankAccount> comparatorMoney = Comparator.comparing(obj -> obj.getMoney());
    double sum = 0.0;

    public ClientLogic(Client client) {
        this.client = client;
    }

    public BankAccount findAccount(BankAccount account) {
        for (int i = 0; i < client.getAccounts().size(); i++) {
            if(account.getName().equals(client.getAccounts().get(i).getName()))
            {
                return client.getAccounts().get(i);
            }
        }
        return null;
    }

    public Client sortAccountsByName() {
        client.getAccounts().sort(comparatorName);
        return client;
    }

    public Client sortAccountsByMoney() {
        client.getAccounts().sort(comparatorMoney);
        return client;
    }

    public double getTotalMoney() {
        for (int i = 0; i < client.getAccounts().size(); i++) {
            sum+=client.getAccounts().get(i).getMoney();
        }
        return sum;
    }

    public double getPositiveTotalMoney() {
        for (int i = 0; i < client.getAccounts().size(); i++) {
            double temp = client.getAccounts().get(i).getMoney();
            sum = temp>0?(sum+temp):sum;
        }
        return sum;
    }

    public double getNegativeTotalMoney() {
        for (int i = 0; i < client.getAccounts().size(); i++) {
            double temp = client.getAccounts().get(i).getMoney();
            sum = temp<0?(sum+temp):sum;
        }
        return sum;
    }

}
