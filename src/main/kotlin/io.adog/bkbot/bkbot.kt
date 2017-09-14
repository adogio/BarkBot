package io.adog.bkbot
import io.adog.wechat.*
import io.adog.seprate.*
external fun require(module:String):dynamic

class bkbot(mode: String){
    var mode: String;
    init{
        val a = wechat("123");
        this.mode = a.mode;
    }
}