package com.example;

public class Person {

    public float weight;
    public float height;

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public  void getIMC() {
        double imc = this.weight / Math.pow(this.height,2);
        System.out.println(imc);
    }
}