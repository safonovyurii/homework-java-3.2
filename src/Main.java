public class Main {
    public static void main(String[] args) {
        BimService service = new BimService();
        int weightKg = 90;
        double heightMetre = 1.75;
        int bim =(int) (weightKg / (heightMetre * heightMetre));
        int myCalculate = service.calculate(bim);
        System.out.println("Индекс массы тела:" + bim);

    }
}