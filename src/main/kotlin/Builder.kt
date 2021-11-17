
import builders.CarBuilder
import builders.CarManualBuilder
import cars.Car
import cars.Manual
import director.Director


fun main(){

    var director : Director = Director()

    var builder : CarBuilder = CarBuilder()
    director.constructSUV(builder)

    var car : Car = builder.getResult()
    println("car built:\n" + car.getCarType())

    var manualBuilder : CarManualBuilder = CarManualBuilder()

    director.constructSUV(manualBuilder)
    var carManual : Manual = manualBuilder.getResult()
    println("\nCar manual built:\n" + carManual.print())
}
