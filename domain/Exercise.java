package domain;

public class Exercise {

    // Константа для цифри, яку верстат не друкує
    private static final int DEFECTIVE_DIGIT = 2;

    /**
     * Обчислює кількість помилкових табличок у заданому діапазоні.
     *
     * @param totalShelves загальна кількість полиць на складі
     * @return кількість табличок, що потребують передруку
     */
    public int calculate(int totalShelves) {
        int faultyCount = 0;
        for (int i = 1; i <= totalShelves; i++) {
            if (hasDigit(i, DEFECTIVE_DIGIT)) {
                faultyCount++;
            }
        }
        return faultyCount;
    }

    /**
     * Перевіряє, чи містить число конкретну цифру.
     * * @param number число для перевірки
     * @param digit цифра, яку шукаємо
     * @return true, якщо цифра присутня в числі
     */
    private boolean hasDigit(int number, int digit) {
        int temp = number;
        while (temp > 0) {
            if (temp % 10 == digit) {
                return true;
            }
            temp /= 10;
        }
        return false;
    }
}
