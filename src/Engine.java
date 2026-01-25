public class Engine {
    private String cc;
    private String hp;


    public Engine (String cc){
        this.cc = cc;
    }

    public Engine(String cc, String hp){
        this.cc = cc;
        this.hp = hp;

    }

    public void setCC(String cc1){
        this.cc = cc1;
    }

    public String getCC(){
        return this.cc;
    }

    public void setHP(String hp1){
        this.hp =hp1;
    }

    public String getHP(){
        return this.hp;
    }
}