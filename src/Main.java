public class Main {

    public static void main(String[] args) {
        int amount = 100;  // у клиента на счете
        int contributed = 1000;  // сумма пополнения
        int bonus = 100;  // бонус за пополнение

        boolean isReffil = true;

        if (isReffil) {
            int ruble = 1;
        } else {
            int ruble = 0;
        }

        System.out.println(contributed / bonus + "получено бонусов");
        System.out.println(amount + contributed + (contributed / bonus) + "итоговая сумма");
    }
}



