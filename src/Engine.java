/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed:1/25/2026
 * Last Date Changed:1/25/2026
 * Rev: 1/25/2026

 */
/** engine class
     kevin ajdini
 */
public class Engine {
    private String cc;
    private String hp;

/** constructor constructs "what is a cc and hp" */
    public Engine (String cc){
        this.cc = cc;
    }

    public Engine(String cc, String hp){
        this.cc = cc;
        this.hp = hp;

    }
/** setter lets us set specific cc */
    public void setCC(String cc1){
        this.cc = cc1;
    }
/** getter gets the cc that the user inputs */
    public String getCC(){
        return this.cc;
    }
/** setter same as above */
    public void setHP(String hp1){
        this.hp =hp1;
    }
/** getter same as above */
    public String getHP(){
        return this.hp;
    }
}