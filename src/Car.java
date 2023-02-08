public class Car {
    private String nameCar;
    private int year;
    private String nameOwnerCar;
    private String[] asansCars;


    public Car(String nameCar, int year, String nameOwnerCar, String[] asansCars) {
        this.nameCar = nameCar;
        this.year = year;
        this.nameOwnerCar = nameOwnerCar;
        this.asansCars = asansCars;
    }

    public void close(){
        System.out.println("Биздин машина бузулуп жатат");
    }
    public void drive(){
        System.out.println("Машина журуп жатат");
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameOwnerCar() {
        return nameOwnerCar;
    }

    public void setNameOwnerCar(String nameOwnerCar) {
        this.nameOwnerCar = nameOwnerCar;
    }

    public String[] getAsansCars() {
        return asansCars;
    }

    public void setAsansCars(String[] asansCars) {
        this.asansCars = asansCars;
    }
}
