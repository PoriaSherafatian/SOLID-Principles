package Dev.Poria.DependencyInversionPrinciple;

public class UserNotification {
    private NotificationService notificationService;

    public UserNotification(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.sendNotification(message);
    }
}

