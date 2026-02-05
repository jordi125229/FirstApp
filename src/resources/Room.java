package resources;

import Money.Money;

import java.util.Set;

class Room extends Resource {
    int seats;
    Set<String> equipment;

    public Room(String name, Money customHourlyRate, int seats, Set<String> equipment) {
        super(name, customHourlyRate);
        this.seats = seats;
        this.equipment = equipment;
    }

    @Override
    protected Money baseRatePerHour() {
        if (customHourlyRate != null) {
            return customHourlyRate;
        }
        return baseRatePerHour();
    }

    @Override
    public String describe() {
        return name + "; " + seats + "; equipment: " + equipment;
    }
}
