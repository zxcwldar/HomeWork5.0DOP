package com.company;

public class Boss {
   private int bossHealth;
   private int bossDamage;
   private String bossDeffence;

    public Boss(int bossHealth, int bossDamage, String bossDeffence) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.bossDeffence = bossDeffence;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDeffence() {
        return bossDeffence;
    }

    public void setBossDeffence(String bossDeffence) {
        this.bossDeffence = bossDeffence;
    }
}


