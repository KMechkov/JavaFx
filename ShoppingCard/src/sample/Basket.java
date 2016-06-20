package sample;

/**
 * Created by kristiyanmechkov on 6/16/2016.
 */
public class Basket {


    private int coll;
    private String value;

    public Basket(int coll, String value) {
        this.coll = coll;
        this.value = value;
    }

    public int getColl() {
        return coll;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setColl(int coll) {
        this.coll = coll;
    }


}
