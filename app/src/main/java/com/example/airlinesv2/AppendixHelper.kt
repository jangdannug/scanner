package com.example.airlinesv2

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

fun getFsCodes(jsonData: JsonObject?): List<DbFsIataCode> {

    val appendix = jsonData?.get("appendix")?.jsonObject
    val airlines: JsonArray? = if (appendix != null && appendix.containsKey("airlines")){
        appendix ["airlines"]?.jsonArray
    }
    else {
        null
    }

    val dbfsCodeList = mutableListOf <DbFsIataCode> ()
    if (airlines != null){
        for (airline in airlines){
            val airlineObject = airline.jsonObject
            val fs = airlineObject ["fs"]?.jsonPrimitive?.content?.replace("*", "")
            val iata = airlineObject ["iata"]?.jsonPrimitive?.content?.replace("*", "")

            if (!fs.isNullOrEmpty()  && !iata.isNullOrEmpty()){
                dbfsCodeList.add(DbFsIataCode(fs, iata))
            }
        }

    }

    val test = dbfsCodeList

    return dbfsCodeList
}