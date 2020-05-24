package com.aguerredev.controlStructures

class Account {
    BigDecimal balance = 0.0

    void deposit (def amount) {
        if(amount < 0) {
            throw new Exception("No negative deposit amounts allowed")
        }

        balance += amount
    }

    void deposit (def... deposits) {
        deposits.each { amount ->
            deposit(amount)
        }
    }
}
