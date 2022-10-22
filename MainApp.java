package Phone;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Всё время идет холивар по поводу ОС в мире мобильных смартфонов.");
        System.out.println("Давайте сравним!");

        Androids android1 = new Androids();
        android1.model = "Huawei";
        android1.subModel = "P50";
        android1.price = 1200;
        Androids android2 = new Androids();
        android2.model = "Xiaomi";
        android2.subModel = "P20 Pro";
        android2.price = 900;
        Androids android3 = new Androids();
        android3.model = "Samsung";
        android3.subModel = "A7 Pro Max";
        android3.price = 1100;

        iPhones iPhone1 = new iPhones();
        iPhone1.subModel = "12X";
        iPhone1.price = 700;
        iPhones iPhone2 = new iPhones();
        iPhone2.subModel = "13 pro max";
        iPhone2.price = 900;
        iPhones iPhone3 = new iPhones();
        iPhone3.subModel = "14 pro";
        iPhone3.price = 1400;

        System.out.println("____________________\n---- OS " + Androids.osName + " ----");
        Androids callAndroid = new Androids();
        Androids smsAndroid = new Androids();
        Androids internetAndroid = new Androids();
        Androids linuxos = new Androids();
        Phone.callPhone();
        callAndroid.call();
        Phone.smsPhone();
        smsAndroid.sms();
        Phone.internetPhone();
        internetAndroid.internet();
        Phone.osPhone();
        linuxos.linux();

        System.out.println("---------------------------------------------\n Самые распространенные модели на ОС " + Androids.osName);
        android1.totalAndroid();
        android2.totalAndroid();
        android3.totalAndroid();

        System.out.println("___________________\n---- OS " + iPhones.osName + " ----");
        iPhones calliPhone = new iPhones();
        iPhones smsiPhone = new iPhones();
        iPhones internetiPhone = new iPhones();
        iPhones ios = new iPhones();
        Phone.callPhone();
        calliPhone.call();
        Phone.smsPhone();
        smsiPhone.sms();
        Phone.internetPhone();
        internetiPhone.internet();
        Phone.osPhone();
        ios.mac();

        System.out.println("---------------------------------------------\n Самые распространенные модели на ОС " + iPhones.osName);
        iPhone1.totaliPhones();
        iPhone2.totaliPhones();
        iPhone3.totaliPhones();

    }
}
