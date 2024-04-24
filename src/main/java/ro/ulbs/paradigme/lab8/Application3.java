package ro.ulbs.paradigme.lab8;

public class Application3 {
    public static void main(String[] args) {

        NewIntCalculator calculator = new NewIntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("5.4.3 a) " + result);

        try {
            calculator.divide(0);
        }catch(ArithmeticException ex) {
            System.out.println("There is an arithmetic exception: " + ex.getMessage());
        }

        DoubleCalculator fCalculator = new DoubleCalculator(10);
        double result2 = fCalculator.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("5.4.3 b) "+result2);

        double val = fCalculator.result();
        double divisionResult = fCalculator.divide(0).result();
        if(divisionResult == Double.POSITIVE_INFINITY) {
            System.out.println("Division "+val+" by 0 results in positive infinity.");
        }

        fCalculator.clear();
        val = -5;
        divisionResult = fCalculator.add(val).divide(0).result();
        if(divisionResult == Double.NEGATIVE_INFINITY) {
            System.out.println("Division "+val+" by 0 results in negative infinity.");
        }
    }
}
