package Phone;

public class Phone {
    String subModel;
    double price;

    public Phone() {
    }

    public static void callPhone() {
        System.out.println("Что касается рингтонов при входящем звонке:");
    }

    public static void smsPhone() {
        System.out.println("Вы ещё отправляете смс-ки?");
    }

    public static void internetPhone() {
        System.out.println("Какой браузер предпочтительнее?");
    }

    public static void osPhone() {
        System.out.println("Удобна ли операционная система смартфона?");
    }
}
