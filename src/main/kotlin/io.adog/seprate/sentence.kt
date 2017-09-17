package io.adog.seprate
import io.adog.seprate.*

class sentence(sentence: String, segment: dynamic) {
    val sentence: String;
    val segment: dynamic;
    var parsed: dynamic;

    init {
        this.sentence = sentence;
        this.segment = segment;
        this.parsed = swapeAll(this.segment.doSegment(this.sentence));
    }

    public fun p(){
        return this.parsed;
    }

    public fun s(): String{
        return this.sentence;
    }
    
}