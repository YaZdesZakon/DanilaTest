package org.danil.test.college.food;

public class FoodFactory {
    public Food createBorch(){
        Food borch=new Food(5, "borch",10);
        return borch;
    }
    public Food createKartoxa(){
        Food kartoxa=new Food(3, "KARTOXA",20);
        return kartoxa;
    }
    public Food createKotleta(){
        Food kotleta=new Food(3, "Kotleta",30);
        return kotleta;
    }
}
