package movie;

public class AmountDiscount extends DefaultDiscountPolicy {
  private Money discountAmount;

  public AmountDiscount(Money discountAmount, DiscountCondition ... conditions) {
    super(conditions);
    this.discountAmount = discountAmount;
  }

  @Override
  public Money calculateDiscountAmount(Screening screening) {
    return super.calculateDiscountAmount(screening);
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return discountAmount;
  }
}
