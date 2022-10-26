import kotlinx.datetime.LocalDate
import org.dhis2.multi.DailyPeriodGenerator
import kotlin.test.Test
import kotlin.test.assertEquals

class DailyPeriodGeneratorTest {

    private val periodGenerator = DailyPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        assertEquals(periodGenerator.getPeriodId(LocalDate(2022, 10,5)), Period("20221005"))
    }
}
