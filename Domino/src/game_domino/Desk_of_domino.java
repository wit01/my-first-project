package Game_Domino;

import java.util.ArrayList;

public class Desk_of_domino {
 private ArrayList<Stone> desk = new ArrayList<>(); 

    public Desk_of_domino() {
        
    }
    
    public int check_desk (){
    return desk.size(); 
    }
    
    public void add_desk (int x, int y){
    Stone e;
    e = new Stone(x, y);
    desk.add(e);
    }
}