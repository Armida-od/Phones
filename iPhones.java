package Phone;

public class iPhones extends Phone implements Smartphones, iOS {

    static String osName = "iPhone";

    @Override
    public void call() {
        System.out.println("• Стандартный системный звук");
    }

    @Override
    public void sms() {
        System.out.println("• Можно изменить имя и фото отправителя. Добавить более интересные смайлики.");

    }

    @Override
    public void internet() {
        System.out.println("• Safari browser по умолчанию.");
    }


    @Override
    public void mac() {
        System.out.println("• Подходит для обычных пользователей.");
    }

    void totaliPhones() {
        System.out.println("• " + iPhones.osName + " " + subModel + " -> стоимость: " + price + " $");
    }
}
