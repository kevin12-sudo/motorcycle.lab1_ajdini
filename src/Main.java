public class Main {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle("RED");
        System.out.println("Motorcycle 1 color:" + m1.getColor());
        Motorcycle m2 = new Motorcycle("BLUE");
        System.out.println("Motorcycle 2 color:" + m2.getColor());
        Motorcycle m3 = new Motorcycle("GREEN");
        System.out.println("Motorcycle 3 color:" + m3.getColor());

        Engine eg1 = new Engine("200","20");
        System.out.println("Motorcycle 1 engine size and horse power:" + eg1.getCC() + eg1.getHP() );
        System.out.println("Motorcycle 1 Horse power:" + eg1.getHP());
        Engine eg2 = new Engine("500", "80");
        System.out.println("Motorcycle 2 engine size:" +eg2.getCC());
        System.out.println("Motorcycle 2 Horse power:" +eg2.getHP());
        Engine eg3 = new Engine("800","200");
        System.out.println("Motorcycle 3 engine size:" +eg3.getCC());
        System.out.println("Motorcycle 3 Horse power:" +eg3.getHP());

        Make Motorcycle1 = new Make("HONDA","DIO");
        System.out.println("Motorcycle 1 make and model:" + Motorcycle1.getBrand() + Motorcycle1.getModel());
        Make Motorcycle2 = new Make("BMW","G310R");
        System.out.println("Motorcycle 2 make and model:" + Motorcycle2.getBrand() + Motorcycle2.getModel());
        Make Motorcycle3 = new Make("YAMAHA","MT07");
        System.out.println("Motorcycle 3 make and model:" + Motorcycle3.getBrand() + Motorcycle3.getModel());

        Frame M1F = new Frame(Materials.PLASTIC);
        System.out.println("Motorcycle 1 frame material:" + M1F.getFrame());
        Frame M2F = new Frame(Materials.CARBON_FIBER);
        System.out.println("Motorcycle 2 frame material:" + M2F.getFrame());
        Frame M3F = new Frame(Materials.TUNGSTEN);
        System.out.println("Motorcycle 3 frame material:" + M3F.getFrame());

        Tires M1T = new Tires("17.5","Michelin");
        System.out.println("Motorcycle 1 tire size and brand"+M1T.getSize()+M1T.getBrand());











    }
}
