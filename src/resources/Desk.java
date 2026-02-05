package resources;

import Money.Money;

class Desk extends Resource {
    DeskType type;

    public Desk(String name, Money customHourlyRate, DeskType type) {
        super(name, customHourlyRate);
        this.type = type;
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
        return name + "; " + type;
    }
}

enum DeskType{
    HOT, FIXED;
}