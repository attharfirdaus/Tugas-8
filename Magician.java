package com.Exception;

import java.util.Random;

public class Magician extends Character{

    @Override
    public boolean attack() {
        if ((Math.random()*10) >= 1 && (Math.random()*10) <= 3.5){
            return true;
        }else {return false;}
    }

    public String getSimpleName() {
        return "Magician";
    }
}
