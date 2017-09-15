package io.adog.bkbot
import io.adog.seprate.*
import io.adog.lib.*

class bkbot(){
    val sep: seprate;
    
    init {
        this.sep = seprate();
    }

    public fun run(){
        this.sep.a("翁爷的鸡巴至少七万5千四百二十八厘米");
        this.sep.a("我在车里喝水");
        this.sep.a("Nana今天吃了很多屎");

        this.sep.log();
    }
}