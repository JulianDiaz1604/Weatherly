package com.kotlinpractice.weatherly.models

class Current {

    private var temperature: Int = 0
    private var weatherCode: Int = 0
    private var weatherDescription: String = ""
    private var windSpeed: Int = 0
    private var windDegree: Int = 0
    private var windDir: String = ""
    private var pressure: String = ""
    private var precipitation: Int = 0
    private var humidity: Int = 0
    private var cloudCover: Int = 0
    private var feelsLike: Int = 0
    private var uvIndex: Int = 0
    private var visibility: Int = 0
    private var isDay: String = ""

    public constructor(
        temperature: Int,
        weatherCode: Int,
        weatherDescription: String,
        windSpeed: Int,
        windDegree: Int,
        windDir: String,
        pressure: String,
        precipitation: Int,
        humidity: Int,
        cloudCover: Int,
        feelsLike: Int,
        uvIndex: Int,
        visibility: Int,
        isDay: String
    ) {
        this.temperature = temperature
        this.weatherCode = weatherCode
        this.weatherDescription = weatherDescription
        this.windSpeed = windSpeed
        this.windDegree = windDegree
        this.windDir = windDir
        this.pressure = pressure
        this.precipitation = precipitation
        this.humidity = humidity
        this.cloudCover = cloudCover
        this.feelsLike = feelsLike
        this.uvIndex = uvIndex
        this.visibility = visibility
        this.isDay = isDay
    }
}