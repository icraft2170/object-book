package ticket;

public class Bag {
  private Long amount;
  private Invitation invitation;
  private Ticket ticket;

  public Bag(Long amount) {
    this.amount = amount;
  }

  public Bag(Invitation invitation, Long amount) {
    this.invitation = invitation;
    this.amount = amount;
  }

  public void minusAmount(Long amount) {
    this.amount -= amount;
  }

  public Long hold(Ticket ticket) {
    if (hasInvitation()) {
      setTicket(ticket);
      return 0L;
    } else {
      setTicket(ticket);
      this.minusAmount(ticket.getFee());
      return ticket.getFee();
    }
  }

  private boolean hasInvitation() {
    return invitation != null;
  }

  private void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }


}
