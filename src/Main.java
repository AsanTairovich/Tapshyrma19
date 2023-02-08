import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota Camry",2011, "Asan",new String[]{"Toyota Camry 40", "Toyota Camry 70", "Toyota Camry 50", "Toyota Camry 30"});
        car.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Asanдан кайсыл индекстеги  машинасына отургунуз келип жатат");
        int s = scanner.nextInt();

        try {
            System.out.println(car.getAsansCars()[s]);
            car.drive();
            System.out.println("Отурунуз кеттик");
        }catch (ArrayIndexOutOfBoundsException array){
            System.out.println("Asanда 4 эле машинасы бар. Акыркысы 3 индексте жайгашкан");
        }
        System.out.println("____________________________________________________");
    }
}