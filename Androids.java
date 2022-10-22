package Phone;

public class Androids extends Phone implements Smartphones, LinuxOS {

    String model;
    static String osName = "Android";
    static String osLinux = "Linux";

    @Override
    public void call() {
        System.out.println("• Возможность выбрать любой звук или музыку.");
    }

    @Override
    public void sms() {
        System.out.println("• Стандартные SMS.");
    }

    @Override
    public void internet() {
        System.out.println("• Chrome browser по умолчанию.");
    }

    @Override
    public void linux() {
        System.out.println("• Чтоб пользоваться " + Androids.osLinux + " необходимы дополнительные знания.");
    }

    void totalAndroid() {
        System.out.println("• " + model + " " + subModel + " -> стоимость: " + price + " $");
    }
}
