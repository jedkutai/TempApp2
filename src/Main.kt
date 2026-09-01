//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val c = Celsius(100.0)
    val f = Fahrenheit(100.0)
    val k = Kelvin(100.0)

    println("C: ${c.getTemp()}")
    println("C to F: ${c.getTempIn(Temperature.Unit.F)}")
    println("C to K: ${c.getTempIn(Temperature.Unit.K)}")


    println("\nF: ${c.getTemp()}")
    println("F to C: ${c.getTempIn(Temperature.Unit.C)}")
    println("F to K: ${c.getTempIn(Temperature.Unit.K)}")

    println("\nK: ${c.getTemp()}")
    println("K to F: ${c.getTempIn(Temperature.Unit.F)}")
    println("K to C: ${c.getTempIn(Temperature.Unit.C)}")
}