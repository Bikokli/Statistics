import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import ru.netology.StaticsService;

public class StaticsServiceTest {
    private AssertJUnit Assertions;

    // 1.Сумму всех продаж.
    @Test
    public void theSumOfAllSales() {
        StaticsService service = new StaticsService();
        int[] maxSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int luckyMonth = 180;
        int actualMonth = service.theSumOfAllSales(maxSum);
        Assertions.assertEquals(luckyMonth, actualMonth);
    }

    // 2.Среднюю сумму продаж в месяц.
    @Test
    public void monthOfPeakSales() {
        StaticsService service = new StaticsService();
        int[] averageSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int luckyMonth = 15;
        int actualMonth = service.averageSalesPerMonth(averageSum);
        Assertions.assertEquals(luckyMonth, actualMonth);
    }

    // 3.Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    @Test
    public void shouldFindBetweenEnds() {
        StaticsService service = new StaticsService();
        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int luckyMonth = 5;
        int actualMonth = service.monthOfPeakSales(sum);
        Assertions.assertEquals(luckyMonth, actualMonth);
    }

    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
    @Test
    public void theMonthWithTheLowestSales() {
        StaticsService service = new StaticsService();
        int[] min = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int luckyMonth = 8;
        int actualMonth = service.theMonthWithTheLowestSales(min);
        Assertions.assertEquals(luckyMonth, actualMonth);
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2).
    @Test
    public void monthsInWhichSalesWereBelowAverage() {
        StaticsService service = new StaticsService();
        int[] belowTheAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int luckyMonth = 5;
        int actualMonth = service.monthsInWhichSalesWereBelowAverage(belowTheAverage);
        Assertions.assertEquals(luckyMonth, actualMonth);

    }

    // 6. Количество месяцев, в которых продажи были выше среднего (см. п.2).
    @Test
    public void salesWereAboveVverage() {
        StaticsService service = new StaticsService();
        int[] aboveAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int luckyMonth = 5;
        int actualMonth = service.salesWereAboveVverage(aboveAverage);
        Assertions.assertEquals(luckyMonth, actualMonth);
    }

}
