//This is the AccidentReport class with fields set to private
// meaning it can only do used in this class
//Which is why later we set the getters and setters to public
public class AccidentReport {
    private String cityName;
    private int carAccidents;
    private int bikeAccidents;

    //parametized constructor
    public AccidentReport(String cityName, int carAccidents, int bikeAccidents){
      setCityName(cityName);
      setCarAccidents(carAccidents);
      setBikeAccidents(bikeAccidents);
    }

    //empty constructor
    public AccidentReport(){
        cityName = "Unknown city";
        carAccidents = 0;
        bikeAccidents = 0;
    }

    //Getter for carAccidents and it returns the value of the private field
    public int getCarAccidents(){
        return carAccidents;
    }

    //Setter for carAccidents and it ensures the value is never less than zero and if it is
    //Then the program sets the value to zero
    public void setCarAccidents(int carAccidents){
        if(carAccidents < 0){
            this.carAccidents = 0;
        }else {
            this.carAccidents = carAccidents;
        }
    }

    //getter for bike accidents and it returns the private value
    public int getBikeAccidents(){
        return bikeAccidents;
    }

    //Setter for bikeAccidents and it ensures the value is never less than zero and if it is
    //Then the program sets the value to zero
    public void setBikeAccidents(int bikeAccidents) {
        if(bikeAccidents < 0){
            this.bikeAccidents = 0;
        }else {
            //Takes string value from main
            this.bikeAccidents = bikeAccidents;
        }
    }


    public String getCityName(){
        return cityName;
    }

    //This setter takes the String value passed from
    // main (like 'Johannesburg') and stores it in the object's private cityName field.
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    //prints report when you call this method
    public void printSummary(){
        int totalAccidents = carAccidents + bikeAccidents;
        System.out.println("City : " + cityName);
        System.out.println("Car Accidents: " + carAccidents);
        System.out.println("Totals number of accidents: " + totalAccidents);
    }

    //Adds the new cars and new bikes variable to the total
    public void logAccident(int newCars, int newBikes){
        this.carAccidents = this.carAccidents + newCars;
        this.bikeAccidents = this.bikeAccidents + newBikes;
    }

    //method overloading with different parameters
    public void logAccident(int count, String vehicleType ){

        if(vehicleType.equalsIgnoreCase("Car")){
            this.carAccidents = this.carAccidents + count;
        }else if(vehicleType.equalsIgnoreCase("Bike")){
            this.bikeAccidents = this.bikeAccidents + count;
        }
    }

    public static void main(String[] Args){
        AccidentReport accidentReport1 = new AccidentReport();

        accidentReport1.setCityName("Johannesburg");
        accidentReport1.setCarAccidents(50);
        accidentReport1.setBikeAccidents(48);

        AccidentReport accidentReport2 = new AccidentReport("Durban", 89, 20);
        accidentReport1.logAccident(8, 9);
        accidentReport1.logAccident(4, "Car");

        accidentReport1.printSummary();
        accidentReport2.printSummary();


    }
}
