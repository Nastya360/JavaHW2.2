public class Main {
    public static void main(String[] args) {
        int amount = 1500;
        int initial = 300;
        int balance = (amount + initial);

        int bonus;
        if (amount >= 1000) {
            bonus = (amount / 100);
        } else {
            bonus = 0;
        }

        int overallBalance = (bonus + balance);
        System.out.println("Итоговый баланс:" + overallBalance);
        System.out.println("Бонус:" + bonus);
    }

}

