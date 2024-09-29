package exercise;

// BEGIN
class App {
    public static void printSquare(Circle circle) {
        try {
            int squareToInt = (int) Math.ceil(circle.getSquare());
            System.out.println(squareToInt);

        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");

        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
