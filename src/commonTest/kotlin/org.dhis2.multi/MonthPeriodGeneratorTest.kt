package org.dhis2.multi

import kotlinx.datetime.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class MonthPeriodGeneratorTest {

    private val periodGenerator = MonthPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        assertEquals(periodGenerator.getPeriodId(LocalDate(2022, 10,5)), Period("202210"))
    }
}
