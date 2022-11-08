package Models;

import java.sql.Time;

public class Bill {
    private Ticket ticket;

    private int duration;

    private int amount;

    private Time exitTime;
    private Operator operator;
    private Gate gate;
}
