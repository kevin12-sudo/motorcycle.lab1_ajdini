/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed:1/25/2026
 * Last Date Changed:1/25/2026
 * Rev: 1/25/2026

 */
/**make class
    kevin ajdini */
public class Make {
    private String brand;
    private String model;
/** constructor */
    public Make(String brand){
        this.brand = brand;
    }
    public Make(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
/** setter*/
    public void setModel(String model1){
        this.model = model1;
    }

    public void setBrand(String brand1){
        this.brand = brand1;
    }
    /** getter*/
    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }
}
