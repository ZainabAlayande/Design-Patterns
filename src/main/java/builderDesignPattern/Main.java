package builderDesignPattern;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder("Bless", 39)
                .email("bless@gmail.com")
                .address("23C Trade Street")
                .build();
        System.out.println(person);


        Car car = Car.CarBuilder
                .builder()
                .model("BMW XM")
                .color("Red")
                .name("BMW")
                .year(2013)
                .build();
        System.out.println(car);
    }



}
