public class BimService {
    public int calculate(int bim,int weightKg,double heightMetre ) {
         weightKg = 90;
         heightMetre = 1.75;
         bim = (int) (weightKg / (heightMetre * heightMetre));
        return bim;
    }
}
