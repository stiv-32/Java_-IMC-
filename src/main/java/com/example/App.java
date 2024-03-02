package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
      Person stiven = new Person(80.0f, 1.88f);
      IMC stivenImc = new IMC(stiven);
      stivenImc.setPersonState();
    }
}
