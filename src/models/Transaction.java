package models;

import java.time.LocalDateTime;

public class Transaction {
    private final double amount;
    private final String type;
    private final LocalDateTime timestamp;

    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getSummary() {
        return "[" + timestamp + "] " + type.toUpperCase() + " $" + amount;
    }
}
