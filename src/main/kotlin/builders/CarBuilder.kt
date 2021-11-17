package builders

import cars.Car
import cars.CarType
import components.Engine
import components.GPSNavigator
import components.Transmission
import components.TripComputer

class CarBuilder : Builder {

    private lateinit var type : CarType
    private var seats : Int = 0
    private lateinit var engine: Engine
    private lateinit var transmission: Transmission
    private lateinit var tripComputer: TripComputer
    private lateinit var gpsNavigator: GPSNavigator

    override fun setCarType(type: CarType?) {
        this.type = type!!
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine?) {
        this.engine = engine!!
    }

    override fun setTransmission(transmission: Transmission?) {
        this.transmission = transmission!!
    }

    override fun setTripComputer(tripComputer: TripComputer?) {
        this.tripComputer = tripComputer!!
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator?) {
        this.gpsNavigator = gpsNavigator!!
    }

    fun getResult() : Car{
        return Car(type , seats , engine , transmission , tripComputer , gpsNavigator )
    }
}