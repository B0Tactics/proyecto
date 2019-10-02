package edu.eci.game.model;
import java.util.ArrayList;
import edu.eci.game.model.*;
public class players{
    private ArrayList<player> list;
    public players(){
        list=new ArrayList<player>();
        player p1=new player(Nicolas,nico123);
        player p2=new player(Andres,andres123);
        player p3=new player(Andy,Andy123);
        list.add(p1);
        list.add(p2);
        list.add(p3);
    }
    public ArrayList<player> getPlayers(){
        return list;
    }
}