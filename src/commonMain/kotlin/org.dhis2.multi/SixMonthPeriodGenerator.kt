package org.dhis2.multi

import kotlinx.datetime.LocalDate

class SixMonthPeriodGenerator() {

    fun getPeriodId(date: LocalDate): Period {
        val year = date.year
        val month = (date.monthNumber/6 + 1).toString().padStart(2, 'S')

        return Period("$year$month")
    }
}
