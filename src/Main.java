public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount1 = 1_000_000; // Вводится сумма кредита в рублях
        int year1 = 1; // Вводится срок кредита в годах
        double payment1 = service.calculate(1_000_000, 1);
        System.out.println("ПР. Ежемесячный платеж: " + Math.round(payment1) + " рублей.");
        System.out.println("ОР. Ежемесячный платеж: 87911 рублей.");

        int amount2 = 1_000_000; // Вводится сумма кредита в рублях
        int year2 = 2; // Вводится срок кредита в годах
        double payment2 = service.calculate(1_000_000, 2);
        System.out.println("ПР. Ежемесячный платеж: " + Math.round(payment2) + " рублей.");
        System.out.println("ОР. Ежемесячный платеж: 46140 рублей.");

        int amount3 = 1_000_000; // Вводится сумма кредита в рублях
        int year3 = 3; // Вводится срок кредита в годах
        double payment3 = service.calculate(1_000_000, 3);
        System.out.println("ПР. Ежемесячный платеж: " + Math.round(payment3) + " рублей.");
        System.out.println("ОР. Ежемесячный платеж: 32262 рублей.");
    }
}
