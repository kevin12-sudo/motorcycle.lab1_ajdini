/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed:1/25/2026
 * Last Date Changed:1/25/2026
 * Rev: 1/25/2026

 */
/**motorcycle class*/
/** kevin ajdini*/
public class Motorcycle {
    private String color;
    private Engine engine;
    private Frame frame;
    private Make make;
    private Tires tires;  // Changed from String to Tires object

    /**
     * constructor
     */
    public Motorcycle(String color1, String cc, String hp, Material frameMaterial, String brand, String model, String tireSize, String tireBrand) {
        this.color = color1;
        this.engine = new Engine(cc, hp);
        this.frame = new Frame(frameMaterial);
        this.make = new Make(brand, model);
        this.tires = new Tires(tireSize);  // Create Tires object
        this.tires.setBrand(tireBrand);    // Set tire brand using setter
    }

    /**
     * getters returns the inputs
     */
    public String getColor() {
        return this.color;
    }

    public String getEngineCC() {
        return engine.getCC();
    }

    public String getEngineHP() {
        return engine.getHP();
    }

    public Material getframeMaterial() {
        return frame.getMaterial();
    }

    public String getMakeBrand() {
        return make.getBrand();
    }

    public String getMakeModel() {
        return make.getModel();
    }

    public String getTireSize() {
        return tires.getSize();
    }

    public String getTireBrand() {
        return tires.getBrand();
    }

    /**
     * setters change and updates things about the motorcycle
     */
    public void setColor(String color1) {
        this.color = color1;
    }

    public void setEngineCC(String cc1) {
        this.engine.setCC(cc1);
    }
    public void setEngineHP(String hp1) {
        this.engine.setHP(hp1);
    }

    public void setMakeBrand(String brand1) {
        this.make.setBrand(brand1);
    }

    public void setMakeModel(String model1) {
        this.make.setModel(model1);
    }

    public void setTireSize(String size1) {
        this.tires.setSize(size1);
    }

    public void setTireBrand(String brand1) {
        this.tires.setBrand(brand1);
    }
}