package com.Exception;

import java.util.Random;

public class Warrior extends Character{

    @Override
    public boolean attack() {
        if ((int)(Math.random()*10) >= 1 && (int)(Math.random()*10) <= 6){
            return true;
        }else {return false;}
    }

    public String getSimpleName() {
        return "Warrior";
    }
}
