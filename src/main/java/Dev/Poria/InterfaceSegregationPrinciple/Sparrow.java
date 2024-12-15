package Dev.Poria.InterfaceSegregationPrinciple;

public class Sparrow implements Bird, FlyingBird {

    @Override
    public void eat() {
        System.out.println("Sparrow is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow is chirping.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

