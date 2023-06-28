package com.kotlinpractice.weatherly.data.daofactory

import com.kotlinpractice.weatherly.data.daofactory.DAOFactory
import com.kotlinpractice.weatherly.helpers.SqlConnectionHelper
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class PostgreSQLDAOFactory: DAOFactory() {

    private val sqlConnectionHelper = SqlConnectionHelper()
    private lateinit var connection: Connection
    private val host = "localhost"
    private val database = "colombia"
    private val user = "postgres"
    private val password = "123"

    override fun openConnection() {

        val url = "jdbc:postgresql://$host:5432/$database";

        try {
            connection = DriverManager.getConnection(url, user, password)
        } catch (exception: SQLException) {
            TODO("Create custom exception")
        }

    }

    override fun initTransaction() {

        try {
            sqlConnectionHelper.initTransaction(connection)
        } catch (exception: Exception) {
            TODO("Create data exception")
        }

    }

    override fun confirmTransaction() {

        try {
            sqlConnectionHelper.commitTransaction(connection)
        } catch (exception: Exception) {
            TODO("Create data exception")
        }

    }

    override fun cancelTransaction() {

        try {
            sqlConnectionHelper.rollBackTransaction(connection)
        } catch (exception: Exception) {
            TODO("Create data exception")
        }

    }

    override fun closeConnection() {

        try {
            sqlConnectionHelper.closeConnection(connection)
        } catch (exception: Exception) {
            TODO("Create data exception")
        }

    }

}