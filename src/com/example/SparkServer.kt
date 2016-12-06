package com.example

import com.google.gson.Gson
import spark.Spark.get
import spark.Spark.port

object SparkServer {
    @JvmStatic fun main(args: Array<String>) {
        port(9999)

        val gson = Gson()

        get("/request", { request, response ->
            "Hello World"
        }, gson::toJson)
    }
}