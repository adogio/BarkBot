package io.adog.seprate

class seprate(){
    val segment: dynamic;
    init{
        var segmenttemp = js("require('segment')");
        this.segment = js("new segmenttemp()");
        this.segment.useDefault();
    }

    public fun a(sentence: String){
        return swapeAll(this.segment.doSegment(sentence));
    }
}