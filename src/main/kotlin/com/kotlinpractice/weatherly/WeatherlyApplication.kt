package com.kotlinpractice.weatherly

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeatherlyApplication

fun main(args: Array<String>) {
    runApplication<WeatherlyApplication>(*args)
}
