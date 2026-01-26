/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed:1/25/2026
 * Last Date Changed:1/25/2026
 * Rev: 1/25/2026

 */
/** Kevin ajdini
     main class
     allows to get color */
public class Main {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle("BLACK");
        System.out.println("Motorcycle 1 color:" + m1.getColor());
        Motorcycle m2 = new Motorcycle("BLUE");
        System.out.println("Motorcycle 2 color:" + m2.getColor());
        Motorcycle m3 = new Motorcycle("GREEN");
        System.out.println("Motorcycle 3 color:" + m3.getColor());

        Engine eg1 = new Engine("500","30"); /** getter for engine allows for user input to print */
        eg1.setCC("200");  /** setters for cc and hp once set they will print as is*/
        eg1.setHP("20");
        System.out.println("Motorcycle 1 engine size:" + eg1.getCC() + " " + "Horse power:" + eg1.getHP());
        Engine eg2 = new Engine("500", "80");
        System.out.println("Motorcycle 2 engine size:" +eg2.getCC() + " " + "Horse power" + eg2.getHP());
        Engine eg3 = new Engine("800","200");
        System.out.println("Motorcycle 3 engine size:" +eg3.getCC() + " " + "Horse power" + eg3.getHP());

        Make Motorcycle1 = new Make("HONDA","DIO");  /** getter for make*/
        Motorcycle1.setModel("GROM"); /** setter for model and brand */
        Motorcycle1.setBrand("HONDA");
        System.out.println("Motorcycle 1 make and model:" + Motorcycle1.getBrand() + " " + Motorcycle1.getModel());
        Make Motorcycle2 = new Make("BMW","G310R");
        System.out.println("Motorcycle 2 make and model:" + Motorcycle2.getBrand() + " " + Motorcycle2.getModel());
        Make Motorcycle3 = new Make("YAMAHA","MT07");
        System.out.println("Motorcycle 3 make and model:" + Motorcycle3.getBrand() + " " + Motorcycle3.getModel());

        Frame M1F = new Frame(Materials.PLASTIC); /** frame and material getters*/
        System.out.println("Motorcycle 1 frame material:" + M1F.getFrame());
        Frame M2F = new Frame(Materials.CARBON_FIBER);
        System.out.println("Motorcycle 2 frame material:" + M2F.getFrame());
        Frame M3F = new Frame(Materials.TUNGSTEN);
        System.out.println("Motorcycle 3 frame material:" + M3F.getFrame());

        Tires M1T = new Tires("17.5","Michelin"); /** getter for tires*/
        System.out.println("Motorcycle 1 tire size and brand:"+M1T.getSize()+ " " +M1T.getBrand());
        Tires M2T = new Tires("19.5","Dunlop");
        M2T.setSize("21.5"); /** tire size and brand of tire*/
        M2T.setBrand("Avon");
        System.out.println("Motorcycle 2 tire size and brand:"+M2T.getSize()+ " " +M2T.getBrand());
        Tires M3T = new Tires("20.3","Pirelli");
        System.out.println("Motorcycle 3 tire size and brand:"+M3T.getSize()+ " " +M3T.getBrand());













    }
}
