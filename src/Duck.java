/**
 * Created by paudie on 21/10/2017.
 */
public class Duck {

    private String duckType;
    private String duckSound;
    private String duckAction;

    public Duck(String duckType, String duckSound, String duckAction){
        super();
        this.duckType = duckType;
        this.duckSound = duckSound;
        this.duckAction = duckAction;
    }

    public String getDuckType(){
        return duckType;
    }

    public String getDuckSound(){
        return duckSound;
    }

    public String getDuckAction(){
        return duckAction;
    }

    public void setDuckType(String duckType){
        this.duckType = duckType;
    }

    public void setDuckSound(String duckSound){
        this.duckSound = duckSound;
    }

    public void setDuckAction(String duckAction){
        this.duckAction = duckAction;
    }

    public void display(){
        System.out.println("Duck Type is " + getDuckType() + " and he can " +
        getDuckSound() + " and can " + getDuckAction() + " in the water.");
    }

}
