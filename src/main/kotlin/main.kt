package io.adog.bkbot
import io.adog.dddd.*
external fun require(module:String):dynamic


fun main(args: Array<String>) {
    val express = require("../src/js/test")
    val a = bkbot("123")
    val b = dddd("123")
    express("1231")
    println(a.mode)
    println(b.mode)
}