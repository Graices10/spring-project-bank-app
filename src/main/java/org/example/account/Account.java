package org.example.account;

public class Account {
    private final int id;
    private final int userId;
    private int moneyAccount;

    public Account(int id, int userId, int moneyAccount) {
        this.id = id;
        this.userId = userId;
        this.moneyAccount = moneyAccount;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(int moneyAccount) {
        this.moneyAccount = moneyAccount;
    }
}
