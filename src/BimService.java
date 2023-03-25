public class BimService {
    public  int calculate(int bim){

        int weightKg = 90;
        double heightMetre =1.75;
        bim =(int) (weightKg / (heightMetre * heightMetre));
        return bim;
    }
}
