import kotlinx.datetime.LocalDate
import org.dhis2.multi.DailyPeriodGenerator
import kotlin.test.Test
import kotlin.test.assertTrue

class DailyPeriodGeneratorTest {

    private val periodGenerator = DailyPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        assertTrue(periodGenerator.getPeriodId(LocalDate(2022, 10,5)) == "20221005")
    }
}
