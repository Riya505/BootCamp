package com.nest.hotel;

public class FoodItems {
    Integer Tea;
    Integer Coffee;
    Integer Espresso;
    Integer ColdCoffee;
    Integer IceTea;

    public FoodItems(Integer tea, Integer coffee, Integer espresso, Integer coldCoffee, Integer iceTea) {
        Tea = tea;
        Coffee = coffee;
        Espresso = espresso;
        ColdCoffee = coldCoffee;
        IceTea = iceTea;
    }

    public Integer getTea() {
        return Tea;
    }

    public void setTea(Integer tea) {
        Tea = tea;
    }

    public Integer getCoffee() {
        return Coffee;
    }

    public void setCoffee(Integer coffee) {
        Coffee = coffee;
    }

    public Integer getEspresso() {
        return Espresso;
    }

    public void setEspresso(Integer espresso) {
        Espresso = espresso;
    }

    public Integer getColdCoffee() {
        return ColdCoffee;
    }

    public void setColdCoffee(Integer coldCoffee) {
        ColdCoffee = coldCoffee;
    }

    public Integer getIceTea() {
        return IceTea;
    }

    public void setIceTea(Integer iceTea) {
        IceTea = iceTea;
    }
}
