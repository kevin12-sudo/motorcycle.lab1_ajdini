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
        Motorcycle m1 = new Motorcycle("BLACK","200","20",Material.STEEL,"HONDA","DIO","17.7","Avon");
        /** prints out every classification of the motorcycle */
        System.out.println("Motorcycle 1 color:" + m1.getColor());
        System.out.println("Motorcycle 1 brand and model:" + m1.getMakeBrand() + " " + m1.getMakeModel());
        System.out.println("Motorcycle 1 engine cc and hp:" +m1.getEngineCC() +" "+ m1.getEngineHP());
        System.out.println("Motorcycle 1 tire size and brand:" + m1.getTireSize() +" "+ m1.getTireBrand());
        System.out.println("Motorcycle 1 frame material:" + m1.getframeMaterial());

        Motorcycle m2 = new Motorcycle("BLUE","250","45",Material.PLASTIC,"BMW","G310R","19","Pirelli");
        System.out.println("Motorcycle 2 color:" + m2.getColor());
        System.out.println("Motorcycle 2 brand and model:" + m2.getMakeBrand() + " " + m2.getMakeModel());
        System.out.println("Motorcycle 2 engine cc and hp:" +m2.getEngineCC() +" "+ m2.getEngineHP());
        System.out.println("Motorcycle 2 tire size and brand:" + m2.getTireSize() +" "+ m2.getTireBrand());
        System.out.println("Motorcycle 2 frame material:" + m2.getframeMaterial());

        Motorcycle m3 = new Motorcycle("RED","400","100",Material.CARBON_FIBER,"YAMAHA","MT-07","15.6","Michelin");
        /** setters used to update and change classifications of the motorcycle*/
        m3.setColor("ORANGE");
        m3.setEngineCC("300");
        m3.setEngineHP("80");
        m3.setMakeBrand("YAMAHA");
        m3.setMakeModel("MT-15");
        m3.setTireSize("16");
        m3.setTireBrand("DUNLOP");
        System.out.println("Motorcycle 3 color:" + m3.getColor());
        System.out.println("Motorcycle 3 brand and model:" + m3.getMakeBrand() + " " + m3.getMakeModel());
        System.out.println("Motorcycle 3 engine cc and hp:" +m3.getEngineCC() +" "+ m3.getEngineHP());
        System.out.println("Motorcycle 3 tire size and brand:" + m3.getTireSize() +" "+ m3.getTireBrand());
        System.out.println("Motorcycle 3 frame material:" + m3.getframeMaterial());

















    }
}
