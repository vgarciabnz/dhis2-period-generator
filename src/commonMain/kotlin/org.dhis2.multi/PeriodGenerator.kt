package org.dhis2.multi

import kotlinx.datetime.LocalDate

class PeriodGenerator {

    fun getPeriodId(date: LocalDate, periodType: String): String {
        return when (periodType) {
            "Monthly" -> MonthPeriodGenerator().getPeriodId(date)
            "Daily" -> DailyPeriodGenerator().getPeriodId(date)
            else -> ""
        }
    }
}
