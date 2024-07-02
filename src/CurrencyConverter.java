//9. Crie uma interface CurrencyConverter com um método convert(double
//amount, String fromCurrency, String toCurrency). Implemente esta interface
//em duas classes diferentes, UsdToEurConverter e EurToThbConverter, que
//convertem valores entre diferentes moedas.
public interface CurrencyConverter {
    double convert(double amount, String fromCurrency, String toCurrency);
}

