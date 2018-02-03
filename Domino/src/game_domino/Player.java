package Game_Domino;

import java.util.ArrayList;

public class Player {

    private final String nome[] = {"A", "B", "C", "D"};
    public boolean start;
    private ArrayList<Stone> Player1 = new ArrayList<>();
    private ArrayList<Stone> Player2 = new ArrayList<>();
    private ArrayList<Stone> Player3 = new ArrayList<>();
    private ArrayList<Stone> Player4 = new ArrayList<>();

    public Player() {
        Domino d = new Domino();
        new Screen();
        Stone j;

// Player 1
        j = new Stone(d.getgroup().get(0).value1, d.getgroup().get(0).value2);
        Player1.add(j);
        j = new Stone(d.getgroup().get(1).value1, d.getgroup().get(1).value2);
        Player1.add(j);
        j = new Stone(d.getgroup().get(2).value1, d.getgroup().get(2).value2);
        Player1.add(j);
        j = new Stone(d.getgroup().get(3).value1, d.getgroup().get(3).value2);
        Player1.add(j);
        j = new Stone(d.getgroup().get(4).value1, d.getgroup().get(4).value2);
        Player1.add(j);
        j = new Stone(d.getgroup().get(5).value1, d.getgroup().get(5).value2);
        Player1.add(j);
        j = new Stone(d.getgroup().get(6).value1, d.getgroup().get(6).value2);
        Player1.add(j);

// Player 2
        j = new Stone(d.getgroup().get(7).value1, d.getgroup().get(7).value2);
        Player2.add(j);
        j = new Stone(d.getgroup().get(8).value1, d.getgroup().get(8).value2);
        Player2.add(j);
        j = new Stone(d.getgroup().get(9).value1, d.getgroup().get(9).value2);
        Player2.add(j);
        j = new Stone(d.getgroup().get(10).value1, d.getgroup().get(10).value2);
        Player2.add(j);
        j = new Stone(d.getgroup().get(11).value1, d.getgroup().get(11).value2);
        Player2.add(j);
        j = new Stone(d.getgroup().get(12).value1, d.getgroup().get(12).value2);
        Player2.add(j);
        j = new Stone(d.getgroup().get(13).value1, d.getgroup().get(13).value2);
        Player2.add(j);

// Player 3
        j = new Stone(d.getgroup().get(14).value1, d.getgroup().get(14).value2);
        Player3.add(j);
        j = new Stone(d.getgroup().get(15).value1, d.getgroup().get(15).value2);
        Player3.add(j);
        j = new Stone(d.getgroup().get(16).value1, d.getgroup().get(16).value2);
        Player3.add(j);
        j = new Stone(d.getgroup().get(17).value1, d.getgroup().get(17).value2);
        Player3.add(j);
        j = new Stone(d.getgroup().get(18).value1, d.getgroup().get(18).value2);
        Player3.add(j);
        j = new Stone(d.getgroup().get(19).value1, d.getgroup().get(19).value2);
        Player3.add(j);
        j = new Stone(d.getgroup().get(20).value1, d.getgroup().get(20).value2);
        Player3.add(j);

// Player 4
        j = new Stone(d.getgroup().get(21).value1, d.getgroup().get(21).value2);
        Player4.add(j);
        j = new Stone(d.getgroup().get(22).value1, d.getgroup().get(22).value2);
        Player4.add(j);
        j = new Stone(d.getgroup().get(23).value1, d.getgroup().get(23).value2);
        Player4.add(j);
        j = new Stone(d.getgroup().get(24).value1, d.getgroup().get(24).value2);
        Player4.add(j);
        j = new Stone(d.getgroup().get(25).value1, d.getgroup().get(25).value2);
        Player4.add(j);
        j = new Stone(d.getgroup().get(26).value1, d.getgroup().get(26).value2);
        Player4.add(j);
        j = new Stone(d.getgroup().get(27).value1, d.getgroup().get(27).value2);
        Player4.add(j);

    }

    public ArrayList<Stone> getPlayer1() {
        return Player1;
    }

    public void setPlayer1(ArrayList<Stone> Player1) {
        this.Player1 = Player1;
    }

    public ArrayList<Stone> getPlayer2() {
        return Player2;
    }

    public void setPlayer2(ArrayList<Stone> Player2) {
        this.Player2 = Player2;
    }

    public ArrayList<Stone> getPlayer3() {
        return Player3;
    }

    public void setPlayer3(ArrayList<Stone> Player3) {
        this.Player3 = Player3;
    }

    public ArrayList<Stone> getPlayer4() {
        return Player4;
    }

    public void setPlayer4(ArrayList<Stone> Player4) {
        this.Player4 = Player4;
    }

    public void Your_turn() {
        if (start == false) {
           start = true; 
            for (int i = 0; i < 6; i++) {
                if (Player1.get(i).value1 == 6 && Player1.get(i).value2 == 6) {
                    Player1.remove(i);
                } else if (Player2.get(i).value1 == 6 && Player2.get(i).value2 == 6) {
                    Player2.remove(i);
                } else if (Player3.get(i).value1 == 6 && Player3.get(i).value2 == 6) {
                    Player3.remove(i);
                } else if (Player4.get(i).value1 == 6 && Player4.get(i).value2 == 6) {
                    Player4.remove(i);
                }

            }

        } else {
        }

    }

}
