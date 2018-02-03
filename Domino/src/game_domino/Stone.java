package Game_Domino;
public class Stone {
int value1;
int value2;

    public Stone(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    Stone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getvalue1() {
        return value1;
    }

    public void setvalue1(int value1) {
        this.value1 = value1;
    }

    public int getvalue2() {
        return value2;
    }

    public void setvalue2(int value2) {
        this.value2 = value2;
    }

}