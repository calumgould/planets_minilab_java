public class Runner {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 908973.65);
        System.out.println(mars.getName() + " is " + mars.getSize() + " km in size");
        System.out.println(mars.explode());
    }
}
