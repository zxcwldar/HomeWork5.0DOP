package com.company;

public class Main {

    public static void main(String[] args) {
Boss pudge = new Boss (1250 , 56 , "Magic");
        System.out.println( "Boss.health" + " " +  pudge.getBossHealth() + pudge.getBossDamage() + pudge.getBossDeffence());

        Hero[] typHeroes = createHeroes();
        for (int i = 0; i < typHeroes.length; i++) {
            System.out.println( typHeroes[i].getHeroHealth() +  " "  + typHeroes[i].getHeroDamage() + " " + typHeroes[i].getSuperPower());

        }
    }

    public  static Hero[] createHeroes (){
        Hero max = new Hero(121, 45 , "Superspeed" );
        Hero schelly = new Hero( 132 , 35   );
        Hero leon = new Hero(  176 , 43);
        Hero[] typHeroes = { max , schelly , leon };
        return typHeroes;



    }



}
