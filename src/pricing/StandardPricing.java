package pricing;

import Money.Money;
import booking.Booking;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StandardPricing implements PricingPolicy {

    @Override
    public Money price(Booking booking) {
        Money hourlyRate = booking.getResource().hourlyRate();
        Money pricePerHour = hourlyRate.divide(BigDecimal.valueOf(60));
        return pricePerHour.multiply(new BigDecimal(booking.durationMinutes()));
    }
}
