package io.adog.bkbot

external fun require(module:String):dynamic;
external fun console(log:String):dynamic;

fun main(args: Array<String>) {
    val express = require("../src/js/test");
    val a = bkbot();
    a.run();
    express("1231");
}