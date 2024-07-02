public class usdToEurConverter implements CurrencyConverter{
    @Override
    public double convert(double amount, String fromCurrency, String toCurrency){
        return amount = amount * 0.93;
    }
}
