public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("pumarian");
        dog.setAge(6);
        dog.setBreed("dog type");
        dog.bark();
        dog.jumpHigh();
        dog.ageCheck(5);
        System.out.println(dog.getAge());

        Dog dog1 = new Dog("jimmy", "j",5);
        System.out.println(dog1.getName());
        dog1.setName("kimmy");
    }
}
