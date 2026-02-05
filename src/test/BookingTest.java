package test;

import Money.Money;
import booking.Booking;
import booking.BookingStatus;
import pricing.StandardPricing;
import resources.Desk;
import resources.DeskType;
import user.CompanyUser;
import user.User;

import java.time.LocalDateTime;

class BookingTest {
    public static void main(String[] args) {
        CompanyUser user1 = new CompanyUser("jakub.nowak@gmail.com", "PHU Nowak", "99391009");
        Desk desk = new Desk("001", Money.of("20"), DeskType.HOT);
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);
        StandardPricing price = new StandardPricing();

        Booking booking = new Booking("id", user1, desk, start, end, BookingStatus.CONFIRMED, null);
        System.out.println(booking);

        booking.cancel();
        System.out.println(booking);
    }
}
