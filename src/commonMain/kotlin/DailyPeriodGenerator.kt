import kotlinx.datetime.LocalDate

class DailyPeriodGenerator {

    fun getPeriodId(date:LocalDate): String {
        val year = date.year
        val month = date.monthNumber.toString().padStart(2, '0')
        val day = date.dayOfMonth.toString().padStart(2, '0')

        return "$year$month$day"
    }
}
