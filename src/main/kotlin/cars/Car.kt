package cars

import components.Engine
import components.GPSNavigator
import components.Transmission
import components.TripComputer


class Car {

    private var carType: CarType
    private var seats = 0
    private var engine: Engine
    private var transmission: Transmission
    private var tripComputer: TripComputer
    private var gpsNavigator: GPSNavigator
    private var fuel = 0.0

    constructor(
        carType: CarType,
        seats: Int,
        engine: Engine,
        transmission: Transmission,
        tripComputer: TripComputer,
        gpsNavigator: GPSNavigator,
    ) {
        this.carType = carType
        this.seats = seats
        this.engine = engine
        this.transmission = transmission
        this.tripComputer = tripComputer
        if(this.tripComputer != null){
            this.tripComputer.setCar(this)
        }
        this.gpsNavigator = gpsNavigator
    }

    fun getCarType(): CarType? {
        return carType
    }

    fun getFuel(): Double {
        return fuel
    }

    fun setFuel(fuel: Double) {
        this.fuel = fuel
    }

    fun getSeats(): Int {
        return seats
    }

    fun getEngine(): Engine? {
        return engine
    }

    fun getTransmission(): Transmission? {
        return transmission
    }

    fun getTripComputer(): TripComputer? {
        return tripComputer
    }

    fun getGpsNavigator(): GPSNavigator? {
        return gpsNavigator
    }

}