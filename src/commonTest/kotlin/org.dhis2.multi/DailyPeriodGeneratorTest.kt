package org.dhis2.multi

import kotlinx.datetime.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class DailyPeriodGeneratorTest {

    private val periodGenerator = DailyPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        assertEquals(Period("20221005"), periodGenerator.getPeriodId(LocalDate(2022, 10,5)))
    }
}
