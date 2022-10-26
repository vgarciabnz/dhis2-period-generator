package org.dhis2.multi

import kotlinx.datetime.LocalDate

class MonthPeriodGenerator() {

    fun getPeriodId(date: LocalDate): String {
        val year = date.year
        val month = date.monthNumber.toString().padStart(2, '0')

        return "$year$month"
    }
}
