public class Pow {
    public double calculate(int year) {

        double percentMo = 1 + (9.99 / (100 * 12));
        double month = -(year * 12);


        double pow = Math.pow(percentMo, month);

        return pow;
    }
}
