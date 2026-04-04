
public class AccidentReport {
    public String cityName;
    private int carAccidents;
    public int bikeAccidents;

    //parametized constructor
    public AccidentReport(String c, int ca, int b){
        cityName = c;
        carAccidents = ca;
        bikeAccidents = b;
    }

    //empty constructor
    public AccidentReport(){
        cityName = "Unknown city";
        carAccidents = 0;
        bikeAccidents = 0;
    }

    public int getCarAccidents(){
        return carAccidents;
    }

    public void setCarAccidents(int ca){
         carAccidents = ca;
    }



    public void printSummary(){
        int totalAccidents = carAccidents + bikeAccidents;
        System.out.println("City : " + cityName);
        System.out.println("Car Accidents: " + carAccidents);
        System.out.println("Totals number of accidents: " + totalAccidents);
    }

    public static void main(String[] Args){
        AccidentReport accidentReport1 = new AccidentReport();

        accidentReport1.cityName = "Johannesburg";
        accidentReport1.carAccidents = -50;
        accidentReport1.bikeAccidents = 48;

        System.out.println("Empty constructor display");
        accidentReport1.printSummary();

        //AccidentReport accidentReport2 = new AccidentReport("Durban", 89, 20);
        //System.out.println("Parametized constuctor display");
        //accidentReport2.printSummary();


    }
}
