package pricing;

import Money.Money;
import booking.Booking;

public interface PricingPolicy {
    Money price(Booking booking);
}
