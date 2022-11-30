package strategies;

import models.Ticket;

public interface BillingStrategy {
    int CalculateFees(Ticket ticket);
}
