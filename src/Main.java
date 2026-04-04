import java.util.Scanner;


public class Main extends AccidentReport {
    @Override
    public void printSummary(){
        System.out.println("*Print summary for main*");
    }

    public static void main(String[] Args){
        AccidentReport accidentReport1 = new AccidentReport();


        System.out.println(accidentReport1.getCarAccidents());
        accidentReport1.setCarAccidents(76);
        System.out.println(accidentReport1.getCarAccidents());

        Main main = new Main();
        System.out.println(main.getCarAccidents() + "\nThis is from main ");
        main.printSummary();
    }
}
