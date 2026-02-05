import java.math.BigDecimal;
import java.math.RoundingMode;

class Money {
    private final BigDecimal amount;
    private static final String currency = "PLN";

    public Money(BigDecimal amount) {
        this.amount = amount.setScale(2, RoundingMode.HALF_UP);
    }

    public static Money of(String s) {
        return new Money(new BigDecimal(s));
    }

    public Money add(Money other){
        return new Money(this.amount.add(other.amount));
    }

    public Money subtract(Money other){
        return new Money(this.amount.subtract(other.amount));
    }

    public Money multiply(BigDecimal other) {
        return new Money(this.amount.multiply(other));
    }

    public Money divide(BigDecimal other) {
        return new Money(this.amount.divide(other));
    }
}
