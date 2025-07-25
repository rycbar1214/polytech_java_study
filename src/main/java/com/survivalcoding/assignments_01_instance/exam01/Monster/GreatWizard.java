package com.survivalcoding.assignments_01_instance.exam01.Monster;

public class GreatWizard extends Wizard {
    private int mp=150;

    public GreatWizard(){
        super();
    }
    @Override
//void heal(Hero hero) 재정의 :  hp를 25 회복시키고 자신의 mp를 5 소모
    public void heal(Hero hero){
        //mp가 부족하면 "마나가 부족합니다" 출력
        if(mp < 5){
            System.out.println("마나가 부족합니다");
            return;
        }
        hero.setHp(hero.getHp()+25);
        setMp(getMp()-5);

        System.out.println("힐을 시전했습니다. HP:"+hero.getHp());
        //힐을 성공하면 "힐을 시전했습니다. 대상 HP: XX" 출력
    }
    //void superHeal(Hero hero) : hp를 전부 회복시키고 자신의 mp를 50 소모
    public void superheal(Hero hero){
        //mp가 부족하면 "마나가 부족합니다" 출력
        if(mp < 50){
            System.out.println("마나가 부족합니다");
            return;
        }
        hero.setHp(hero.getMaxHp());
        setMp(getMp()-50);

        System.out.println("슈퍼힐을 시전했습니다. HP:"+hero.getHp());
        //힐을 성공하면 "슈퍼힐을 시전했습니다. 대상 HP: XX" 출력
    }
}
