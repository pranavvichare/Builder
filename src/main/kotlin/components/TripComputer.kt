package components

import cars.Car




class TripComputer {

    private lateinit var car: Car

    fun setCar(car: Car) {
        this.car = car
    }

    fun showFuelLevel() {
        println("Fuel level: " + car!!.getFuel())
    }

    fun showStatus() {
        if (car!!.getEngine()!!.isStarted()) {
            println("Car is started")
        } else {
            println("Car isn't started")
        }
    }
}