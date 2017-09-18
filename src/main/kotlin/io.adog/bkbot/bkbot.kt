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

    public fun learn(sentence: String, response: String): String{
        this.sep.a(sentence);
        var a: String = learn(this.sep.sen(), response);
        this.sep.clean();
        return a;
    }

    public fun response(sentence: String): String{
        this.sep.a(sentence);
        var a: String = learn(this.sep.sen(),"123");
        this.sep.clean();
        return a;
    }
}