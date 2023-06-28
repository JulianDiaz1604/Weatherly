package com.kotlinpractice.weatherly.helpers

class ObjectHelper {

    fun <T> isNull(value: T?): Boolean {
        return value == null
    }

    fun <T> getDefaultIfNull(value: T?, defaultValue: T): T? {
        return if (isNull(value)) defaultValue else value
    }

}