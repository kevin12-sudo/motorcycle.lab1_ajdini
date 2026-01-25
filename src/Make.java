public class Make {
    private String brand;
    private String model;

    public Make(String brand){
        this.brand = brand;
    }
    public Make(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void setModel(String model1){
        this.model = model1;
    }

    public void setBrand(String brand1){
        this.brand = brand1;
    }
    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }
}
