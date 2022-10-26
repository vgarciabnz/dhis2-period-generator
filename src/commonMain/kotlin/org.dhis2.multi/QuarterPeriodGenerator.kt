package org.dhis2.multi

import kotlinx.datetime.LocalDate

class QuarterPeriodGenerator() {

    fun getPeriodId(date: LocalDate): Period {
        val year = date.year
        val month = (date.monthNumber/3 + 1).toString().padStart(2, '0')

        return Period("$year$month")
    }
}
