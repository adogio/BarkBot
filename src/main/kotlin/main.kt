package io.adog.bkbot

external fun require(module:String):dynamic;
external fun console(log:String):dynamic;

fun main(args: Array<String>) {
    val a = bkbot();
    for(i in args){
        a.bot(i);
    }
}