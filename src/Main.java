
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80.5;
        double growth = 1.82;
        double bmi = service.calculate(weight, growth);
        System.out.println("Индекс Массы Тела  "+ String.format("%.0f", bmi));
    }
}