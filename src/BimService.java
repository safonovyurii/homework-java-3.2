public class BimService {
    public int calculate(double heightMetre) {
        int weightKg = 98;
        double index = (heightMetre * heightMetre);
        double bmi = weightKg / index;

        return (int) bmi;

    }
}
