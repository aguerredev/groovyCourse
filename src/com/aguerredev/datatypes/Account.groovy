package com.aguerredev.datatypes

class Account {

    BigDecimal balance = 0.0
    String type

    void Deposit(BigDecimal amount) {
        balance += amount
    }

    void Withdraw(BigDecimal amount) {
        balance -= amount
    }

    BigDecimal plus(Account anotherAccount) {
        return balance + anotherAccount.balance
    }
}
