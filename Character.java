package com.Exception;

public abstract class Character {
    private int defense;
    private int attack;
    private int hp;

    public abstract boolean attack();

    public void receiveDamage(int damage){
        int rcvDamage;
        if (damage > defense){
            rcvDamage = damage - defense;
            hp = hp - rcvDamage;
        }else if (defense == 0){
            hp = hp - damage;
        }
        setHp(hp);

        if (hp < 0){
            setHp(0);
        }
    }


    public void info(){
        System.out.println("HP\t\t : " + getHp());
        System.out.println("Attack\t : " + getAttack());
        System.out.println("Defense\t : " + getDefense());
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
