package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i=1; i<=10; i++){
            int mult = numberTableToPrint*i;
            System.out.println(i+" x "+numberTableToPrint + " = " + mult);
        }
    }
    public  static void main (String [] args){
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int number = 6;
        multiplicationTable.printTable(number);

    }
}
