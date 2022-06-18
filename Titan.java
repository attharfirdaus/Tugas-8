package com.Exception;

import java.util.Random;

public class Titan extends Character{

    @Override
    public boolean attack() {;
        if ((int)(Math.random()*10) >= 1 && (int)(Math.random()*10) <= 4){
            return true;
        }else {return false;}
    }
}
