package models.player;

import enums.PlayerType;
import models.Symbol;

public class Human extends Player{
    private String name;
    Human(String name, Symbol symbol){

        super(PlayerType.HUMAN,symbol);
        this.name=name;
    }
}
