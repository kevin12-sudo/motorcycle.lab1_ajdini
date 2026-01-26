/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed:1/25/2026
 * Last Date Changed:1/25/2026
 * Rev: 1/25/2026

 */
/** tire class
     kevin ajdini*/
public class Tires {
    private String size;
    private String brand;
    /** constructors*/
    public Tires (String size, String brand){
        this.size = size;
        this.brand = brand;
    }
    /** setters*/
    public void setBrand(String brand2){
        this.brand = brand2;
    }
    public void setSize(String size2){
        this.size = size2;

    }
    /** getter*/
    public String getBrand(){
        return this.brand;
    }
    public String getSize(){
        return this.size;
    }

}
