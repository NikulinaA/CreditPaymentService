public class CreditPaymentService {
    public double calculate (int amount, int year) {

        Pow pow = new Pow();
        double percentM = 9.99 / (100 * 12);
        double sum = pow.calculate(year);
        double payment = amount * percentM /(1 - sum);
        return payment;
    }
}
