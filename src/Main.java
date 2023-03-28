public class Main {
    public static void main(String[] args) {
        BimService service = new BimService();
        double heightMetre = 1.87;
        int weightKg = 98;
        int bmi = service.calculate(heightMetre);


        System.out.println("Индекс массы тела:" + bmi);

    }
}