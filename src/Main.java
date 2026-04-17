public class Main {
    public static void main(String[] args) {
        // Стоимость билета в рублях
        int ticketPrice = 13676;

        // Количество рублей для одной мили
        int milesPerRub = 20;

        // Расчёт бонусных миль (целочисленное деление)
        int bonusMiles = ticketPrice / milesPerRub;

        // Вывод результата
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}
