package org.dhis2.multi

import kotlinx.datetime.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class QuarterPeriodGeneratorTest {

    private val periodGenerator = QuarterPeriodGenerator()

    @Test
    fun shouldGetPeriodId() {
        assertEquals(periodGenerator.getPeriodId(LocalDate(2022, 5,5)), Period("202202"))
        assertEquals(periodGenerator.getPeriodId(LocalDate(2022, 10,5)), Period("202204"))
    }
}
