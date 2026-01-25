public class Engine {
    private String size;
    private String hp;


    public Engine(String size){
        this.size = size;
    }

    public Engine(String size, String hp){
        this.size = size;
        this.hp = hp;

    }

    public void setSIZE(String size1){
        this.size = size1;
    }

    public String getSIZE(){
        return this.size;
    }

    public void setHP(String hp1){
        this.hp =hp1;
    }

    public String getHP(){
        return this.hp;
    }
}