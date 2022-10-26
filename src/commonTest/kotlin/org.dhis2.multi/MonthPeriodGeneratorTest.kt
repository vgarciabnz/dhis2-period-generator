package org.dhis2.multi

import kotlinx.datetime.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class MonthPeriodGeneratorTest {

    private val periodGenerator = MonthPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        assertEquals(Period("202210"), periodGenerator.getPeriodId(LocalDate(2022, 10,5)))
    }
}
