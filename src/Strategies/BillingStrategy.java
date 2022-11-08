package Strategies;

import Models.Ticket;

public interface BillingStrategy {
    int CalculateFees(Ticket ticket);
}
