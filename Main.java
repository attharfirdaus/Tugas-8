package com.Exception;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Magician magician = new Magician();
        Healer healer = new Healer();
        Warrior warrior = new Warrior();
        Titan titan = new Titan();
        titan.setHp(200);
        titan.setAttack(45);
        titan.setDefense(0);

        int turn = 1;

        System.out.println("Selamat Datang di Game Defend FILKOM!");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = in.nextLine();

        int pilih = 0;
        boolean err = true;
        do {
            System.out.println("Silahkan pilih karakter yang Anda inginkan : ");
            System.out.println("1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
            try {
                System.out.print("Pilihan Anda : ");
                pilih = in.nextInt();
                in.nextLine();
                System.out.println("Selamat datang, " + nama + "!");
                System.out.println("");
                err = false;
            }catch (InputMismatchException x){
                System.out.println("");
                System.out.println("Tolong masukkan angka!");
                in.nextLine();
            }
        } while (err);

        System.out.println("-------------- STATUS --------------");
        if (pilih == 1){
            magician.setHp(100);
            magician.setAttack(60);
            magician.setDefense(10);
            System.out.println("Role\t : " + magician.getSimpleName());
            magician.info();
            System.out.println("");

            while (magician.getHp() > 0 && titan.getHp() > 0){
                if (magician.attack() == true){
                    titan.receiveDamage(magician.getAttack());
                }
                if (titan.attack() == true){
                    magician.receiveDamage(titan.getAttack());
                }
                System.out.println("============== TURN " + turn + " ==============");
                System.out.println("Enemy's HP : " + titan.getHp());
                System.out.println(nama + "'s HP : " + magician.getHp());
                turn++;
            }

            if (titan.getHp() == 0){
                System.out.println("=====================================");
                System.out.println(nama + " menang");
            }else if (magician.getHp() == 0){
                System.out.println("=====================================");
                System.out.println("Titan menang");
            }else if (magician.getHp() == 0 && titan.getHp() == 0){
                System.out.println("=====================================");
                System.out.println("Seri");
            }

            System.out.println("");
            System.out.println("============== PLAYER ===============");
            System.out.println("-------------- STATUS ---------------");
            System.out.println("Role\t : " + magician.getSimpleName());
            magician.info();
            System.out.println("");

            System.out.println("============== ENEMY ================");
            System.out.println("-------------- STATUS ---------------");
            System.out.println("Role\t : Titan");
            titan.info();
        }else if (pilih == 2){
            healer.setHp(70);
            healer.setAttack(10);
            healer.setDefense(10);
            System.out.println("Role\t : " + healer.getSimpleName());
            healer.info();
            System.out.println("");

            while (healer.getHp() > 0 && titan.getHp() > 0){
                if (healer.attack() == true){
                    titan.receiveDamage(healer.getAttack());
                }
                if (titan.attack() == true){
                    healer.receiveDamage(titan.getAttack());
                }
                if (turn %2 == 0){
                    healer.heal();
                }
                System.out.println("============== TURN " + turn + " ==============");
                System.out.println("Enemy's HP : " + titan.getHp());
                System.out.println(nama + "'s HP : " + healer.getHp());
                turn++;
            }

            if (titan.getHp() == 0){
                System.out.println("=====================================");
                System.out.println(nama + " menang");
            }else if (healer.getHp() == 0){
                System.out.println("=====================================");
                System.out.println("Titan menang");
            }

            System.out.println("");
            System.out.println("============== PLAYER ===============");
            System.out.println("-------------- STATUS ---------------");
            System.out.println("Role\t : " + healer.getSimpleName());
            healer.info();
            System.out.println("");

            System.out.println("============== ENEMY ================");
            System.out.println("-------------- STATUS ---------------");
            System.out.println("Role\t : Titan");
            titan.info();
        }else if (pilih == 3){
            warrior.setHp(80);
            warrior.setAttack(25);
            warrior.setDefense(30);
            System.out.println("Role\t : " + warrior.getSimpleName());
            warrior.info();
            System.out.println("");

            while (warrior.getHp() > 0 && titan.getHp() > 0){
                if (warrior.attack() == true){
                    titan.receiveDamage(warrior.getAttack());
                }
                if (titan.attack() == true){
                    warrior.receiveDamage(titan.getAttack());
                }
                System.out.println("============== TURN " + turn + " ==============");
                System.out.println("Enemy's HP : " + titan.getHp());
                System.out.println(nama + "'s HP : " + warrior.getHp());
                turn++;
            }

            if (titan.getHp() == 0){
                System.out.println("=====================================");
                System.out.println(nama + " menang");
            }else if (warrior.getHp() == 0){
                System.out.println("=====================================");
                System.out.println("Titan menang");
            }

            System.out.println("");
            System.out.println("============== PLAYER ===============");
            System.out.println("-------------- STATUS ---------------");
            System.out.println("Role\t : " + warrior.getSimpleName());
            warrior.info();
            System.out.println("");

            System.out.println("============== ENEMY ================");
            System.out.println("-------------- STATUS ---------------");
            System.out.println("Role\t : Titan");
            titan.info();
        }
    }
}
