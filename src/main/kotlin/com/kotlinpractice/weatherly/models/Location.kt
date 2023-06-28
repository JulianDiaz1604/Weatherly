package com.kotlinpractice.weatherly.models

class Location {

    private var name: String = ""
    private var country: String = ""
    private var region: String = ""
    private var lat: String = ""
    private var lon: String = ""
    private var timezone: String = ""

    public constructor (name: String, region: String) {
        this.name = name
        this.region = region
    }

    public constructor(name: String, country: String, region: String, lat: String, lon: String, timezone: String) {
        this.name = name
        this.country = country
        this.region = region
        this.lat = lat
        this.lon = lon
        this.timezone = timezone
    }

}