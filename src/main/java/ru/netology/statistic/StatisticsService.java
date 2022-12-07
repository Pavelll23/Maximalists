package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income // Индекс максимального дохода
     *
     * @param incomes - array of  incomes // овокупность доходов
     * @return - index of first max value // Индекс первого максимального значения
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0; // Текущий максимальный индекс
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }
}