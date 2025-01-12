package ru.sberbank.jd.lesson02;

/**
 * Вычисляет наибольший общий делитель двух целых чисел.
 */
public class NodCalculator implements Nod {
    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель
     */
    @Override
    public int calculate(int first, int second) {
        if (second == 0) {
            return first;
        } else {
            return calculate(second, first % second);
        }
    }
}
