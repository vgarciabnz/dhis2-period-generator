package org.dhis2.multi

import kotlinx.datetime.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class SixMonthPeriodGeneratorTest {

    private val periodGenerator = SixMonthPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        assertEquals(Period("2022S1"), periodGenerator.getPeriodId(LocalDate(2022, 5,5)))
        assertEquals(Period("2022S2"), periodGenerator.getPeriodId(LocalDate(2022, 10,5)))
    }
}
