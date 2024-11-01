class OldCalculator {
    private int num_1;
    private int num_2;
    public OldCalculator(int num_1, int num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }
    public int getNum1() {
        return num_1;
    }
    public int getNum2() {
        return num_2;
    }
    public int sum() {
        return num_1 + num_2;
    }
}
// NewCal interface
interface NewCal {
    int multiply(); }
// AdaptorCal class
class AdaptorCal implements NewCal {
    private OldCalculator oldCal;
    public AdaptorCal(OldCalculator oldCal) {
        this.oldCal = oldCal;
    }
    public int multiply() {
        int num1 = oldCal.getNum1();
        int num2 = oldCal.getNum2();
        return num1 * num2;}
}
// Display
public class Adapter {
    public static void main(String[] args) {
        OldCalculator oldone = new OldCalculator(20,40);
        NewCal newone = new AdaptorCal(oldone);
        System.out.println("Sum: " + oldone.sum());
        System.out.println("Multiplication: " + newone.multiply());
    }
}