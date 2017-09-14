package io.adog.bkbot
external fun require(module:String):dynamic

fun main(args: Array<String>) {
    val express = require("../src/js/test")
    val a = bkbot("qqq")
    express("1231")
    println(a.mode)
}