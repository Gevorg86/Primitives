public class Main {
    public static void main(String[] args) {

        int balance = 100; // Начальный счет
        int payment = 1001; // Сумма пополнения
        int x = balance + payment; // Текущий баланс


        System.out.println("Текущий баланс -" + x);
        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонусный баланс -" + (bonus));
        System.out.println("Общая сумма счета -" + (x + bonus));

    }
}