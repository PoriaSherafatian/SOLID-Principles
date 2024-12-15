package Dev.Poria.InterfaceSegregationPrinciple;

public class Penguin implements Bird {

    @Override
    public void eat() {
        System.out.println("Penguin is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin is making a sound.");
    }
}

