package Dev.Poria.LiskovSubstitutionPrinciple;

public class Fruit {
    public static void main(String[] args) {
        IFruit apple = new Apple();
        IFruit orange = new Orange();

        System.out.println("Apple color: " + apple.getColor());
        System.out.println("Orange color: " + orange.getColor());
    }
}

interface IFruit {
    String getColor();
}

class Apple implements IFruit {
    @Override
    public String getColor() {
        return "Red";
    }
}

class Orange implements IFruit {
    @Override
    public String getColor() {
        return "Orange";
    }
}
