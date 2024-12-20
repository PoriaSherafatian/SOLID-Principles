package Dev.Poria.OpenClosedPrinciple;

public class Joke {
    public static void main(String[] args) {}
}

abstract class TypeJoke {
    public abstract void tellJoke();
}

class RegularTypeJoke extends TypeJoke {
    public void tellJoke() {
        System.out.println("This is a regular joke!");
    }
}

class KnockKnockTypeJoke extends TypeJoke {
    public void tellJoke() {
        System.out.println("Knock Knock! Who's there?");
    }

    class NEW extends TypeJoke {
        public void tellJoke() {
            System.out.println("Type a new joke!");
        }
    }
}

