package booking;

import Money.Money;
import resources.Resource;
import user.User;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

class Booking {
    String id;
    User user;
    Resource resource;
    LocalDateTime start;
    LocalDateTime end;
    BookingStatus status;
    Money calculatedPrice;
//    Payment payment; //na tym etapie nie mamy tej klasy

    public Booking(String id, User user, Resource resource, LocalDateTime start, LocalDateTime end, BookingStatus status, Money calculatedPrice) {
        this.id = "BK-<" + start + ">-<" + counterCreation() + ">";
        this.user = user;
        this.resource = resource;
        this.start = start;
        this.end = end;
        this.status = status;
        this.calculatedPrice = calculatedPrice;
//        this.payment = payment;
    }

    public void confirmStatus(BookingStatus Status) {
        if (status != BookingStatus.PENDING) {
            this.status = BookingStatus.CONFIRMED;
        }
    }

    public void completeStatus(BookingStatus Status) {
        if (status != BookingStatus.CONFIRMED) {
            this.status = BookingStatus.COMPLETED;
        }
    }

    public void cancelStatus(BookingStatus Status) {
        if (status == BookingStatus.PENDING) {
            this.status = BookingStatus.CONFIRMED;
        }
    }

    int durationMinutes(){
        return (int) Duration.between(start, end).toMinutes();
    }

    static int counterCreation(){
        Random random = new Random();
        return random.nextInt();
    }
}

enum BookingStatus {
    PENDING, CONFIRMED, CANCELLED, COMPLETED;
}


