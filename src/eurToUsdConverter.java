public class eurToUsdConverter implements CurrencyConverter{
    @Override
    public double convert(double amount, String fromCurrency, String toCurrency){
        return amount = amount * 1.07;
    }
}
