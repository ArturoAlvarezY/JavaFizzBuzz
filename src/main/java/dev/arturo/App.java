package dev.arturo;

import dev.arturo.models.FizzBuzz;

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
        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println(fizzBuzz.checkNumber(354));
    }
}
