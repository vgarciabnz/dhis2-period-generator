package org.dhis2.multi

import kotlinx.datetime.LocalDate

class YearlyPeriodGenerator() {

    fun getPeriodId(date: LocalDate): Period {
        val year = date.year

        return Period("$year")
    }
}
