package io.adog.bkbot
import io.adog.seprate.*
import io.adog.lib.*

class bkbot(){
    val sep: seprate;
    
    init {
        this.sep = seprate();
    }
    
    public fun sentence(sentence: String) {
        this.sep.a(sentence);
        this.sep.log();
        this.sep.clean();
    }
}