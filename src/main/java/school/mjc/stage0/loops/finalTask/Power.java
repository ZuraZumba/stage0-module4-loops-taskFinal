package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int degree = 1;
        for (int i=1; i<power; i++){
//            int pow = (int) Math.pow(numberToPrint, power);
         degree  *= numberToPrint;
         }
        System.out.println(numberToPrint*degree);

    }

    public static void main(String[] args) {
        new Power().printPower(-10, 4);
    }
}
