package models;

import java.time.LocalDateTime;
import models.TransactionType;

public class Transaction {
    private final double amount;
    private final TransactionType type;
    private final LocalDateTime timestamp;

    public Transaction(double amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getSummary() {
        return "[" + timestamp + "] " + type + " $" + amount;
    }
}
