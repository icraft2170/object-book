package ticket;

public class Audience {

  private Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public Long buy(Ticket ticket) {
    if (bag.hasInvitation()) {
      this.bag.setTicket(ticket);
      return 0L;
    } else {
      this.bag.setTicket(ticket);
      bag.minusAmount(ticket.getFee());
      return ticket.getFee();
    }
  }
}
