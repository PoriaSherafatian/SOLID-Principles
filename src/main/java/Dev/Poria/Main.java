package Dev.Poria;

import Dev.Poria.DependencyInversionPrinciple.EmailNotificationService;
import Dev.Poria.DependencyInversionPrinciple.NotificationService;
import Dev.Poria.DependencyInversionPrinciple.SMSNotificationService;
import Dev.Poria.DependencyInversionPrinciple.UserNotification;
import Dev.Poria.InterfaceSegregationPrinciple.Bird;
import Dev.Poria.InterfaceSegregationPrinciple.Penguin;
import Dev.Poria.InterfaceSegregationPrinciple.Sparrow;
import Dev.Poria.LiskovSubstitutionPrinciple.Rectangle;
import Dev.Poria.LiskovSubstitutionPrinciple.Shape;
import Dev.Poria.LiskovSubstitutionPrinciple.Square;
import Dev.Poria.OpenClosedPrinciple.Discount;
import Dev.Poria.OpenClosedPrinciple.PercentageDiscount;
import Dev.Poria.OpenClosedPrinciple.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        //OCP
        Discount percentageDiscount = new PercentageDiscount(10);
        ShoppingCart cart = new ShoppingCart(percentageDiscount);
        System.out.println("Final price with percentage discount: " + cart.calculatePrice(100));

        //LSP
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.area());

        Shape square = new Square(5);
        System.out.println("Area of square: " + square.area());

        //ISP
        Bird penguin = new Penguin();
        penguin.eat();
        penguin.makeSound();

        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.makeSound();
        sparrow.fly();

        //DIP
        NotificationService emailService = new EmailNotificationService();
        UserNotification emailNotification = new UserNotification(emailService);
        emailNotification.notifyUser("Hello via Email!");

        NotificationService smsService = new SMSNotificationService();
        UserNotification smsNotification = new UserNotification(smsService);
        smsNotification.notifyUser("Hello via SMS!");
    }
}

//Done by PoriaSherafatian
//Email : PoriaDeveloper@gmail.com
//PhoneNumber : +98 902 717 3739
