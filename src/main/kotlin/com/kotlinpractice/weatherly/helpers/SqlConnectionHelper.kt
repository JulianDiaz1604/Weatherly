package com.kotlinpractice.weatherly.helpers

import com.kotlinpractice.weatherly.helpers.ObjectHelper
import java.sql.Connection
import java.sql.SQLException

class SqlConnectionHelper {

    private val objectHelper: ObjectHelper = ObjectHelper()

    fun connectionIsNull(connection: Connection): Boolean {
        return objectHelper.isNull(connection)
    }

    fun connectionIsOpen(connection: Connection): Boolean {
        try {
            return !objectHelper.isNull(connection) &&!connection.isClosed
        } catch (exception: SQLException) {
            TODO("Create exception")
        }
    }

    fun closeConnection(connection: Connection) {
        try {
            if (!connectionIsOpen(connection)) {
                TODO("Create exception")
            }
            connection.close()
        } catch (exception: Exception) {
            TODO("Create exception")
        }
    }

    fun initTransaction(connection: Connection) {
        try {
            if (!connectionIsOpen(connection)) {
                TODO("Create exception")
            }
            connection.autoCommit = false
        } catch (exception: Exception) {
            TODO("Create exception")
        }
    }

    fun commitTransaction(connection: Connection) {
        try {
            if (!connectionIsOpen(connection)) {
                TODO("Create exception")
            }
            connection.commit()
            connection.autoCommit = false
        } catch (exception: Exception) {
            TODO("Create exception")
        }
    }

    fun rollBackTransaction(connection: Connection) {
        try {
            if (!connectionIsOpen(connection)) {
                TODO("Create exception")
            }
            connection.autoCommit = false
        } catch (exception: Exception) {
            TODO("Create exception")
        }
    }

}