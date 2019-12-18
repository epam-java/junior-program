package com.epam.jmp.patterns.proxy;

public class Account {

    private long id;
    private String accountNumber;

    public Account(long id, String accountNumber) {
        this.id = id;
        this.accountNumber = accountNumber;
    }

    public long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
