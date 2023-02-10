package ru.netology;

public class StaticsService {

    // 1.Сумму всех продаж.
    public int theSumOfAllSales(int[] maxSum) {
        int generalSale = 0;
        for (int i = 0; i < maxSum.length; i++) {
            {
                generalSale = generalSale + maxSum[i];
            }

        }
        return generalSale;
    }

    // 2.Среднюю сумму продаж в месяц.
    public int averageSalesPerMonth(int[] averageSum) {
        int sumSale = 0;
        int i;
        for (i = 0; i < averageSum.length; i++) {
            sumSale = sumSale + averageSum[i];

        }
        int average = sumSale / 12;
        return average;
    }

    // 3.Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    public int monthOfPeakSales(int[] sum) {
        int sumSale = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > sum[sumSale]) {
                sumSale = i;
            }
        }
        return sumSale;
    }

    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
    public int theMonthWithTheLowestSales(int[] min) {
        int minSale = 0;
        for (int i = 0; i < min.length; i++) {
            if (min[i] < min[minSale]) {
                minSale = i;
            }
        }
        return minSale;
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2).
    public int monthsInWhichSalesWereBelowAverage(int[] belowTheAverage) {
        int count = 0;
        int belowMonth = 0;//180
        int belowAverag = 0;
        for (int i = 0; i < belowTheAverage.length; i++) {
            belowMonth = belowMonth + belowTheAverage[i];
        }
        belowAverag = belowMonth / 12;

        for (int i = 0; i < belowTheAverage.length; i++) {
            if (belowTheAverage[i] < belowAverag) {
                count++;

            }
        }


        return count;

    }

    // 6. Количество месяцев, в которых продажи были выше среднего (см. п.2).
    public int salesWereAboveVverage(int[] aboveAverage) {
        int aboveMonth = 0;
        int count = 0;
        int sumAverage = 0;
        for (int i = 0; i < aboveAverage.length; i++) {
            aboveMonth = aboveMonth + aboveAverage[i];
        }
        sumAverage = aboveMonth / 12;

        for (int i = 0; i < aboveAverage.length; i++) {
            if (aboveAverage[i] > sumAverage) {
                count++;
            }
        }
        return count;


    }
}


