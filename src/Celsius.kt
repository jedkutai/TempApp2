class Celsius(temp: Double = 0.0) : Temperature(Unit.C, temp) {
    override fun getTemp(): Double = super.getTemp(unit)
    override fun getTempIn(unit: Unit): Double = super.getTemp(unit)
}