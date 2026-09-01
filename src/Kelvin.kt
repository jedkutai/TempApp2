class Kelvin(temp: Double = 0.0) : Temperature(Unit.K, temp) {
    override fun getTemp(): Double = super.getTemp(unit)
    override fun getTempIn(unit: Unit): Double = super.getTemp(unit)
}