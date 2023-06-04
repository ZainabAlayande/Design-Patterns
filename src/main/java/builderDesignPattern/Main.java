package builderDesignPattern;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder("Bless", 39)
                .setEmail("bless@gmail.com")
                .setAddress("23C Trade Street")
                .build();

        System.out.println(person);
    }



}
