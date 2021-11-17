package cars

import components.Engine
import components.GPSNavigator
import components.Transmission
import components.TripComputer

class Manual {


    private var carType: CarType
    private var seats = 0
    private var engine: Engine
    private var transmission: Transmission
    private var tripComputer: TripComputer
    private var gpsNavigator: GPSNavigator

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
        this.gpsNavigator = gpsNavigator
    }

    fun print(): String? {
        var info = ""
        info += "Type of car: $carType\n"
        info += "Count of seats: $seats\n"
        info += """
             Engine: volume - ${engine.getVolume().toString()}; mileage - ${engine.getMileage().toString()}
             
             """.trimIndent()
        info += "Transmission: $transmission\n"
        info += if (tripComputer != null) {
            """
     Trip Computer: Functional
     
     """.trimIndent()
        } else {
            """
     Trip Computer: N/A
     
     """.trimIndent()
        }
        info += if (gpsNavigator != null) {
            """
     GPS Navigator: Functional
     
     """.trimIndent()
        } else {
            """
     GPS Navigator: N/A
     
     """.trimIndent()
        }
        return info
    }
}