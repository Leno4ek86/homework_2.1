public class Main {
    public static void main(String[] args) {
        int balance = 100; // у клиента на счете
        int inReplenishment = 500; // сумма пополнения

        boolean sum = inReplenishment >= 1000;
        int bonus = sum ? inReplenishment / 100 : 0;
        int sum2 = balance + inReplenishment + bonus;

        System.out.println(sum2 + "итого на счете клиента");
        System.out.println(bonus + "итого начислено бонусов");

    }
}
