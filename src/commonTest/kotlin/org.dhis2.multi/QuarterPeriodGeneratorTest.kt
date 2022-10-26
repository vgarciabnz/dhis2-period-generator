package org.dhis2.multi

import kotlinx.datetime.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class QuarterPeriodGeneratorTest {

    private val periodGenerator = QuarterPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        assertEquals(Period("2022Q2"), periodGenerator.getPeriodId(LocalDate(2022, 5,5)))
        assertEquals(Period("2022Q3"), periodGenerator.getPeriodId(LocalDate(2022, 9,5)))
    }
}
