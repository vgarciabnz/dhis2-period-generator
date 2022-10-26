package org.dhis2.multi

import kotlinx.datetime.LocalDate
import org.dhis2.multi.PeriodType.*

class PeriodGenerator {

    fun getPeriodId(date: LocalDate, periodType: PeriodType): Period {
        return when (periodType) {
            Yearly -> YearlyPeriodGenerator().getPeriodId(date)
            Six_monthly -> SixMonthPeriodGenerator().getPeriodId(date)
            Quarterly -> QuarterPeriodGenerator().getPeriodId(date)
            Monthly -> MonthPeriodGenerator().getPeriodId(date)
            Daily -> DailyPeriodGenerator().getPeriodId(date)
        }
    }
}
