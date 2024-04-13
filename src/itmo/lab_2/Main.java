package itmo.lab_2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result1 = calculator.sum(2.5, 3.5);
        long result2 = calculator.sum(3L, 5L);
        int result3 = calculator.sum(3, 5);
        double result4 = calculator.divide(2.5, 3.5);
        long result5 = calculator.divide(10L, 2L);
        int result6 = calculator.divide(15, 5);
        double result7 = calculator.multiply(2.5, 3.5);
        long result8 = calculator.multiply(10L, 2L);
        int result9 = calculator.multiply(3, 5);
        double result10 = calculator.subtract(3.5, 4.5);
        long result11 = calculator.subtract(10L, 2L);
        int result12 = calculator.subtract(5, 3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);
        System.out.println(result11);
        System.out.println(result12);

        VentilationUnit ventilationUnit = new VentilationUnit();

        ventilationUnit.setNameUnit("P1");
        String unitName = ventilationUnit.getNameUnit();
        ventilationUnit.setWidthUnit(800);
        int unitWidth = ventilationUnit.getWidthUnit();
        ventilationUnit.setLengthUnite(3000);
        int unitLength = ventilationUnit.getLengthUnite();
        ventilationUnit.setServiceSide("правая");
        String unitServiceSide = ventilationUnit.getServiceSide();
        ventilationUnit.setPower(3.2);
        double unitPower = ventilationUnit.getPower();
        ventilationUnit.setAirFlow(5000);
        int unitAirFlow = ventilationUnit.getAirFlow();
        VentilationUnit ventilationUnit2 = new VentilationUnit(100, 200);

        System.out.println(unitName);
        System.out.println("Ширина вентиляционной установки: " + unitWidth + " мм");
        System.out.println("Длина вентиляционной установки: " + unitLength + " мм");
        System.out.println("Сторона обслуживания вентиляционной установки: " + unitServiceSide);
        System.out.println("Мощность вентиляционной установки: " + unitPower + " кВт");
        System.out.println("Расход вентиляционной установки: " + unitAirFlow + " м3/ч");
    }
}
