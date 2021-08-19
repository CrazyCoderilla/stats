package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        StatsService ss = new StatsService();
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(ss.getTotalRevenue(sales));
        System.out.println(ss.getAverageSale(sales));
        System.out.println(ss.getTopMonth(sales));
        System.out.println(ss.getWorstMonth(sales));
        System.out.println(ss.getMonthsAmountWorseAverage(sales));
        System.out.println(ss.getMonthsAmountBetterAverage(sales));
    }

    public long getTotalRevenue(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long getAverageSale(long[] sales) {
        return getTotalRevenue(sales) / sales.length;
    }

    public long getTopMonth(long[] sales) {
        int topMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[topMonth]) {
                topMonth = i;
            }
        }
        return topMonth + 1;
    }

    public long getWorstMonth(long[] sales) {
        int worstMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[worstMonth]) {
                worstMonth = i;
            }
        }
        return worstMonth + 1;
    }

    public int getMonthsAmountWorseAverage(long[] sales) {
        long average = getAverageSale(sales);
        int amount = 0;

        for (long sale : sales) {
            if (sale < average) {
                amount++;
            }
        }

        return amount;
    }

    public int getMonthsAmountBetterAverage(long[] sales) {
        long average = getAverageSale(sales);
        int amount = 0;

        for (long sale : sales) {
            if (sale > average) {
                amount++;
            }
        }

        return amount;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

}