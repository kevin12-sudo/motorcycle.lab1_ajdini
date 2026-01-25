public class Main {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle("RED");
        System.out.println("Motorcycle 1 color:" + m1.getColor());

        Motorcycle m2 = new Motorcycle("BLUE");
        System.out.println("Motorcycle 2 color:" + m2.getColor());

        Motorcycle m3 = new Motorcycle("GREEN");
        System.out.println("Motorcycle 3 color:" + m3.getColor());

        Engine eg1 = new Engine("900","988");
        System.out.println("Motorcycle 1 engine size:" + eg1.getSIZE());
        System.out.println("Motorcycle 1 Horse power:" + eg1.getHP());
        Engine eg2 = new Engine("670", "672");
        System.out.println("Motorcycle 2 engine size:" +eg2.getSIZE());
        System.out.println("Motorcycle 2 Horse power:" +eg2.getHP());
        Engine eg3 = new Engine("998","899");
        System.out.println("Motorcycle 3 engine size:" +eg3.getSIZE());
        System.out.println("Motorcycle 3 Horse power:" +eg3.getHP());
    }
}
