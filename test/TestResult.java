package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        final int TOTAL_SHELVES = 50000;

        int result = exercise.calculate(TOTAL_SHELVES);

        System.out.println("Загальна кількість полиць: " + TOTAL_SHELVES);
        System.out.println("Кількість табличок, які треба передрукувати (містять '2'): " + result);
    }
}
