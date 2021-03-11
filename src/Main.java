
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80.5;
        double growth = 1.82;
        double bmi = service.calculate(weight, growth);
        System.out.printf("Индекс Массы Тела: %.0f", bmi);
    }
}