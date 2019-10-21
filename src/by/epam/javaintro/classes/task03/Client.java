//3. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.

package by.epam.javaintro.classes.task03;

import java.util.LinkedList;

public class Client {
    private String name;
    private LinkedList<BankAccount> accounts;

    public Client() {
        this.name = "unnamed client";
        this.accounts = new LinkedList<>();
    }

    public Client(String name, LinkedList<BankAccount> accounts) {
        this.name = name;
        this.accounts = new LinkedList<>();
        for (int i = 0; i < accounts.size(); i++) {
            this.accounts.add(accounts.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(LinkedList<BankAccount> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            this.accounts.add(accounts.get(i));
        }
    }
}
