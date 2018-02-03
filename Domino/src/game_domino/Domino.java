package Game_Domino;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Wit
 */
public class Domino {
private ArrayList<Stone> group = new ArrayList<>();
public Domino() {
    
Stone p; 
p = new Stone(0,0);
group.add(p);
p = new Stone(0,1);
group.add(p);
p = new Stone(0,2);
group.add(p);
p = new Stone(0,3);
group.add(p);
p = new Stone(0,4);
group.add(p);
p = new Stone(0,5);
group.add(p);
p = new Stone(0,6);
group.add(p);
p = new Stone(1,1);
group.add(p);
p = new Stone(1,2);
group.add(p);
p = new Stone(1,3);
group.add(p);
p = new Stone(1,4);
group.add(p);
p = new Stone(1,5);
group.add(p);
p = new Stone(1,6);
group.add(p);
p = new Stone(2,2);
group.add(p);
p = new Stone(2,3);
group.add(p);
p = new Stone(2,4);
group.add(p);
p = new Stone(2,5);
group.add(p);
p = new Stone(2,6);
group.add(p);
p = new Stone(3,3);
group.add(p);
p = new Stone(3,4);
group.add(p);
p = new Stone(3,5);
group.add(p);
p = new Stone(3,6);
group.add(p);
p = new Stone(4,4);
group.add(p);
p = new Stone(4,5);
group.add(p);
p = new Stone(4,6);
group.add(p);
p = new Stone(5,5);
group.add(p);
p = new Stone(5,6);
group.add(p);
p = new Stone(6,6);
group.add(p);


Collections.shuffle(group);
//System.out.println("====================================\n");
//System.out.println("Stone ["+group.get(0).value1 +"] ["+group.get(0).value2+"]");
//System.out.println("Stone ["+group.get(1).value1 +"] ["+group.get(1).value2+"]");
//System.out.println("Stone ["+group.get(2).value1 +"] ["+group.get(2).value2+"]");
//System.out.println("Stone ["+group.get(3).value1 +"] ["+group.get(3).value2+"]");
//System.out.println("Stone ["+group.get(4).value1 +"] ["+group.get(4).value2+"]");
//System.out.println("Stone ["+group.get(5).value1 +"] ["+group.get(5).value2+"]");
//System.out.println("Stone ["+group.get(6).value1 +"] ["+group.get(6).value2+"]");
//System.out.println("Stone ["+group.get(7).value1 +"] ["+group.get(7).value2+"]");
//System.out.println("Stone ["+group.get(8).value1 +"] ["+group.get(8).value2+"]");
//System.out.println("Stone ["+group.get(9).value1 +"] ["+group.get(9).value2+"]");
//System.out.println("Stone ["+group.get(10).value1 +"] ["+group.get(10).value2+"]");
//System.out.println("Stone ["+group.get(11).value1 +"] ["+group.get(11).value2+"]");
//System.out.println("Stone ["+group.get(12).value1 +"] ["+group.get(12).value2+"]");
//System.out.println("Stone ["+group.get(13).value1 +"] ["+group.get(13).value2+"]");
//System.out.println("Stone ["+group.get(14).value1 +"] ["+group.get(14).value2+"]");
//System.out.println("Stone ["+group.get(15).value1 +"] ["+group.get(15).value2+"]");
//System.out.println("Stone ["+group.get(16).value1 +"] ["+group.get(16).value2+"]");
//System.out.println("Stone ["+group.get(17).value1 +"] ["+group.get(17).value2+"]");
//System.out.println("Stone ["+group.get(18).value1 +"] ["+group.get(18).value2+"]");
//System.out.println("Stone ["+group.get(19).value1 +"] ["+group.get(19).value2+"]");
//System.out.println("Stone ["+group.get(20).value1 +"] ["+group.get(20).value2+"]");
//System.out.println("Stone ["+group.get(21).value1 +"] ["+group.get(21).value2+"]");
//System.out.println("Stone ["+group.get(22).value1 +"] ["+group.get(22).value2+"]");
//System.out.println("Stone ["+group.get(23).value1 +"] ["+group.get(23).value2+"]");
//System.out.println("Stone ["+group.get(24).value1 +"] ["+group.get(24).value2+"]");
//System.out.println("Stone ["+group.get(25).value1 +"] ["+group.get(25).value2+"]");
//System.out.println("Stone ["+group.get(26).value1 +"] ["+group.get(26).value2+"]");
//System.out.println("Stone ["+group.get(27).value1 +"] ["+group.get(27).value2+"]"); 
    }

    public ArrayList<Stone> getgroup() {
        return group;
    }

    public void setgroup(ArrayList<Stone> group) {
        this.group = group;
    }
}