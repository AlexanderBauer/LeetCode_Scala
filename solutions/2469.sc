object Solution {
    def convertTemperature(celsius: Double): Array[Double] = {
        return Array(celsius + 273.15, celsius * 1.8 + 32.00)
    }
}
