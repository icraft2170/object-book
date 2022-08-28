package ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
  private Long amount;
  private List<Ticket> tickets = new ArrayList<>();

  public TicketOffice(Long amount, Ticket ... tickets) {
    this.amount = amount;
    this.tickets.addAll(Arrays.asList(tickets));
  }
  public void sellTicketTo(Audience audience) {
    Long fee = audience.buy(getTicket());
    plusAmount(fee);
  }
  private Ticket getTicket() {
    return tickets.remove(0);
  }
  private void plusAmount(Long amount) {
    this.amount += amount;
  }

}
