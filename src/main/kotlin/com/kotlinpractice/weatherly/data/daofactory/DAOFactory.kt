package com.kotlinpractice.weatherly.data.daofactory

import com.kotlinpractice.weatherly.data.enumeration.DAOFactoryType

abstract class DAOFactory {

    public final fun getDAOFactory(factory: DAOFactoryType): DAOFactory? {

        var daoFactory: DAOFactory? = null

        when(factory) {

            DAOFactoryType.SQLSERVER -> println("Not implemented") //TODO: exception
            DAOFactoryType.CASSANDRA -> println("Not implemented") //TODO: exception
            DAOFactoryType.MARIADB -> println("Not implemented") //TODO: exception
            DAOFactoryType.MONGODB -> println("Not implemented") //TODO: exception
            DAOFactoryType.MYSQL -> println("Not implemented") //TODO: exception
            DAOFactoryType.ORACLE -> println("Not implemented") //TODO: exception
            DAOFactoryType.POSTGRESQL -> daoFactory = PostgreSQLDAOFactory()
        }

        return daoFactory

    }

    protected abstract fun openConnection();

    protected abstract fun initTransaction();

    protected abstract fun confirmTransaction();

    protected abstract fun cancelTransaction();

    protected abstract fun closeConnection();

}