package KlasyWewnetrzne10.Ex_297_1;

/**
 * Created by Marek on 2017-04-02.
 */
public class Outher {
    class Inner {

    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outher outher = new Outher();
        Inner inner = outher.getInner();
    }
}
