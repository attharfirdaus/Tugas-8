package com.Exception;

import java.util.Random;

public class Healer extends Character{

    @Override
    public boolean attack() {
        if ((Math.random()*10) >= 1 && (Math.random()*10) <= 8.5){
            return true;
        }else {return false;}
    }

    public void heal(){
        setHp(getHp() + 25);
    }

    public String getSimpleName() {
        return "Healer";
    }
}
