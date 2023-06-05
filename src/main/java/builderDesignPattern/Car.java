package builderDesignPattern;

public class Car {

    private final String name;
    private final int year;
    private final String color;
    private  final String model;


    private Car(String name, int year, String color, String model) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("""
                Name: %s
                Year: %d
                Color: %s
                Model: %s
                """, name, year, color, model);
    }

    public static class CarBuilder {
        private String name;
        private int year;
        private String model;
        private String color;

        public static CarBuilder builder() {
            return new CarBuilder();
        }

        public CarBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(name, year, model, color);
        }
    }
}
