package com.example.airlinesv2

import java.time.LocalDate
import java.time.LocalDateTime

class Flights {
    var flightIds: List<Int>  // List of integers for flightIds

    var fsCode: List<String>  // List of strings for fsCodes
    var fsNumber: List<String>  // List of strings for fsNumber
    var departureAirportFsCodes: List<String>  // List of strings for departureAirportFsCodes
    var departureDates: List<String>  // List of strings for departureDates
    var queryDates: List<LocalDateTime>

    constructor(
        flightIds: List<Int>,  fsCode: List<String>, fsNumber: List<String>,
        departureAirportFsCodes: List<String>, departureDates: List<Any>, queryDate: List<LocalDateTime>

    ) {
        this.flightIds = flightIds
        this.fsCode = fsCode
        this.fsNumber = fsNumber
        this.departureAirportFsCodes = departureAirportFsCodes
        this.departureDates = departureDates as List<String>
        this.queryDates = queryDate
    }
}


class DbFlight{
    var flightIds: String
    var fsCode: String
    var fsNumber: String
    var departureAirportFsCodes: String
    var departureDates: String

    constructor(
        flightIds: String, fsCode: String, fsNumber: String,
        departureAirportFsCodes: String, departureDates: String
    ) {
        this.flightIds = flightIds
        this.fsCode = fsCode
        this.fsNumber = fsNumber
        this.departureAirportFsCodes = departureAirportFsCodes
        this.departureDates = departureDates
    }
}

class DbDataLogs{
    var executeDt : String
    var dataSize : String
    var execType : String

    constructor(
        executeDt: String, dataSize: String, execType: String
    ){
        this.executeDt = executeDt
        this.dataSize = dataSize
        this.execType = execType
    }
}

class DbAirlines{
    var fsCodes:String
    var iataCode :String
    constructor(
        fsCodes:String, iataCode:String
    ){
        this.fsCodes = fsCodes
        this.iataCode = iataCode

    }
}




class DbDataFlight{
    var flightId: String
    var fsCode: String
    var fsNumber: String
    var departureAirportFsCode: String
    var departureDate: String

    constructor(
        flightId: String, fsCode: String, fsNumber: String,
        departureAirportFsCode: String, departureDate: String
    ) {
        this.flightId = flightId
        this.fsCode = fsCode
        this.fsNumber = fsNumber
        this.departureAirportFsCode = departureAirportFsCode
        this.departureDate = departureDate
    }
}

class BarcodeData{
    var passengerName: String
    var airlineCode: String
    var flightNumber: String
    var flightDate: LocalDate
    var seatNumber: String


    constructor(
        passengerName: String, airlineCode: String, flightNumber: String,
        flightDate: LocalDate, seatNumber: String
    )
    {
        this.passengerName = passengerName
        this.airlineCode = airlineCode
        this.flightNumber = flightNumber
        this.flightDate = flightDate
        this.seatNumber = seatNumber

    }

}



