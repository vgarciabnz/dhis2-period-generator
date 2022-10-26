import kotlinx.datetime.LocalDate
import org.dhis2.multi.MonthPeriodGenerator
import kotlin.test.Test

class MonthPeriodGeneratorTest {

    private val periodGenerator = MonthPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        val periodId = periodGenerator.getPeriodId(LocalDate(2022, 10, 5))
        var periodDigitId = periodGenerator.getPeriodId(LocalDate(2021 ,5,3))
    }
}
