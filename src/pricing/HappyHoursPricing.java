package pricing;

import Money.Money;
import booking.Booking;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

class HappyHoursPricing implements PricingPolicy {
    @Override
    public Money price(Booking booking) {
        LocalTime firstHappyHour = LocalTime.of(14, 00);
        LocalTime lastHappyHour = LocalTime.of(16, 00);
        LocalTime bookingTime = booking.getStart().toLocalTime();
        Money hourlyRate = booking.getResource().hourlyRate();

        if (bookingTime.isAfter(firstHappyHour) && bookingTime.isBefore(lastHappyHour)) {
            hourlyRate = hourlyRate.multiply(new BigDecimal("0.7"));
        }
        Money pricePerHour = hourlyRate.divide(BigDecimal.valueOf(60));
        return pricePerHour.multiply(new BigDecimal(booking.durationMinutes()));
    }
}

