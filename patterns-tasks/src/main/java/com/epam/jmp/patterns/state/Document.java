package com.epam.jmp.patterns.state;

public class Document {

    private long id;
    private long amount;
    private String currencyCode;
    private String contractNumber;

    private State state;

    public Document(long id, long amount, String currencyCode, String contractNumber) {
        this.id = id;
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.contractNumber = contractNumber;
        if (isValid()) {
            state = State.NEW;
        } else {
            state = State.DRAFT;
        }
    }

    public boolean isValid() {
        return amount > 0 ||
                currencyCode == null || currencyCode.isEmpty() ||
                contractNumber == null || contractNumber.isEmpty();
    }

    public void send() {
        if (state.equals(State.NEW)) {
            if (isValid()) {
                System.out.println("Документ успешно отправлен");
                state = State.SENT;
            } else {
                state = State.DRAFT;
            }
        } else if (state.equals(State.DRAFT)) {
            if (!isValid()) {
                System.out.println("Необходимо исправить ошибки перед отправкой");
            } else {
                System.out.println("Документ успешно отправлен");
                state = State.SENT;
            }
        } else if (state.equals(State.SENT)) {
            System.out.println("Документ уже отправлен");
        }
    }

    public State getState() {
        return state;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
}