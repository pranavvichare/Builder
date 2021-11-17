package components

class GPSNavigator {

    private lateinit var route: String

    fun GPSNavigator() {
        route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London"
    }

    fun GPSNavigator(manualRoute: String) {
        route = manualRoute
    }

    fun getRoute(): String {
        return route
    }
}