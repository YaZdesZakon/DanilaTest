package org.danil.test.college.food;

public class Food {
    private Integer calories;
    private String name;
    private Integer price;

    public Food(Integer calories, String name,Integer price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
