package resources;

import Money.Money;

class Device extends Resource {
    int quantity;

    public Device(String name, Money customHourlyRate, int quantity) {
        super(name, customHourlyRate);
        this.quantity = quantity;
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
        return name + "; " + quantity;
    }
}
