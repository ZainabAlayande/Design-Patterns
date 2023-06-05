package builderDesignPattern;

public class Person {

    private String name;
    private int age;
    private String address;
    private String email;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.email = builder.email;
    }

    @Override
    public String toString() {
        return String.format("""
                Name: %s
                Age: %d
                Address: %s
                Email: %s
                """, name, age, address, email);
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String email;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }
}
