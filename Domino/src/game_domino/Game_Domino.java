package Game_Domino;

import java.util.ArrayList;
import java.util.List;


//@author Wit

public class Game_Domino {
public static void main(String[] args) {
Player py = new Player();
Domino one = new Domino();
System.out.println("Reading StoneS \n");

System.out.println("Reading Player 1 stone 1 [" +py.getPlayer1().get(0).value1 +"|"+py.getPlayer1().get(0).value2+ "]");
System.out.println("Reading Player 1 stone 2 [" +py.getPlayer1().get(1).value1 +"|"+py.getPlayer1().get(1).value2+ "]");
System.out.println("Reading Player 1 stone 3 [" +py.getPlayer1().get(2).value1 +"|"+py.getPlayer1().get(2).value2+ "]");
System.out.println("Reading Player 1 stone 4 [" +py.getPlayer1().get(3).value1 +"|"+py.getPlayer1().get(3).value2+ "]");
System.out.println("Reading Player 1 stone 5 [" +py.getPlayer1().get(4).value1 +"|"+py.getPlayer1().get(4).value2+ "]");
System.out.println("Reading Player 1 stone 6 [" +py.getPlayer1().get(5).value1 +"|"+py.getPlayer1().get(5).value2+ "]");
System.out.println("Reading Player 1 stone 7 [" +py.getPlayer1().get(6).value1 +"|"+py.getPlayer1().get(6).value2+ "]");
System.out.println("");
System.out.println("Reading Player 2 stone 1 [" +py.getPlayer2().get(0).value1 +"|"+py.getPlayer2().get(0).value2+ "]");
System.out.println("Reading Player 2 stone 2 [" +py.getPlayer2().get(1).value1 +"|"+py.getPlayer2().get(1).value2+ "]");
System.out.println("Reading Player 2 stone 3 [" +py.getPlayer2().get(2).value1 +"|"+py.getPlayer2().get(2).value2+ "]");
System.out.println("Reading Player 2 stone 4 [" +py.getPlayer2().get(3).value1 +"|"+py.getPlayer2().get(3).value2+ "]");
System.out.println("Reading Player 2 stone 5 [" +py.getPlayer2().get(4).value1 +"|"+py.getPlayer2().get(4).value2+ "]");
System.out.println("Reading Player 2 stone 6 [" +py.getPlayer2().get(5).value1 +"|"+py.getPlayer2().get(5).value2+ "]");
System.out.println("Reading Player 2 stone 7 [" +py.getPlayer2().get(6).value1 +"|"+py.getPlayer2().get(6).value2+ "]");

System.out.println("");
System.out.println("Reading Player 3 stone 1 [" +py.getPlayer3().get(0).value1 +"|"+py.getPlayer3().get(0).value2+ "]");
System.out.println("Reading Player 3 stone 2 [" +py.getPlayer3().get(1).value1 +"|"+py.getPlayer3().get(1).value2+ "]");
System.out.println("Reading Player 3 stone 3 [" +py.getPlayer3().get(2).value1 +"|"+py.getPlayer3().get(2).value2+ "]");
System.out.println("Reading Player 3 stone 4 [" +py.getPlayer3().get(3).value1 +"|"+py.getPlayer3().get(3).value2+ "]");
System.out.println("Reading Player 3 stone 5 [" +py.getPlayer3().get(4).value1 +"|"+py.getPlayer3().get(4).value2+ "]");
System.out.println("Reading Player 3 stone 6 [" +py.getPlayer3().get(5).value1 +"|"+py.getPlayer3().get(5).value2+ "]");
System.out.println("Reading Player 3 stone 7 [" +py.getPlayer3().get(6).value1 +"|"+py.getPlayer3().get(6).value2+ "]");

System.out.println("");
System.out.println("Reading Player 4 stone 1 [" +py.getPlayer4().get(0).value1 +"|"+py.getPlayer4().get(0).value2+ "]");
System.out.println("Reading Player 4 stone 2 [" +py.getPlayer4().get(1).value1 +"|"+py.getPlayer4().get(1).value2+ "]");
System.out.println("Reading Player 4 stone 3 [" +py.getPlayer4().get(2).value1 +"|"+py.getPlayer4().get(2).value2+ "]");
System.out.println("Reading Player 4 stone 4 [" +py.getPlayer4().get(3).value1 +"|"+py.getPlayer4().get(3).value2+ "]");
System.out.println("Reading Player 4 stone 5 [" +py.getPlayer4().get(4).value1 +"|"+py.getPlayer4().get(4).value2+ "]");
System.out.println("Reading Player 4 stone 6 [" +py.getPlayer4().get(5).value1 +"|"+py.getPlayer4().get(5).value2+ "]");
System.out.println("Reading Player 4 stone 7 [" +py.getPlayer4().get(6).value1 +"|"+py.getPlayer4().get(6).value2+ "]");
System.out.println("");


System.out.println("stone total p1-"+py.getPlayer1().size());
System.out.println("stone total p2-"+py.getPlayer2().size());
System.out.println("stone total p3-"+py.getPlayer3().size());
System.out.println("stone total p4-"+py.getPlayer4().size());
System.out.println("");
py.Your_turn();
System.out.println("who start with [6|6] ");
System.out.println("");
System.out.println("total p1 - "+py.getPlayer1().size());
System.out.println("total p2 - "+py.getPlayer2().size());
System.out.println("total p3 - "+py.getPlayer3().size());
System.out.println("total p4 - "+py.getPlayer4().size());


//System.out.println("total "+py.getPlayer1().size());
//Desk_of_domino m = new Desk_of_domino();
//m.add_desk(1,1);
//System.out.println(m.check_desk());
//m.add_desk(1,2);
//System.out.println(m.check_desk());
}  
}