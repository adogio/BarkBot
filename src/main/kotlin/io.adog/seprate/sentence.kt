package io.adog.seprate
import io.adog.seprate.*
import io.adog.lib.*

class sentence(sentence: String, segment: dynamic) {
    val sentence: String;
    val segment: dynamic;
    var parsed: Array<dynamic>;

    init {
        this.sentence = sentence;
        this.segment = segment;
        this.parsed = swapeAll(this.segment.doSegment(this.sentence));
    }

    public fun p(): Array<dynamic>{
        return this.parsed;
    }

    public fun s(): String{
        return this.sentence;
    }

    public fun n(): jarray{
        var re = jarray();
        for(i in parsed){
            if(js("i.p") == "n"){
                re.push(js("i.w"))
            }
        }
        return re;
    }
    
}