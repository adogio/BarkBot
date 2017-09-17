package io.adog.bkbot
import io.adog.seprate.*
import io.adog.lib.*
import io.adog.ai.*

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

    public fun bot(sentence: String){
        this.sep.a(sentence);
        console.log(response(this.sep.sen()));
        this.sep.clean();
    }
}