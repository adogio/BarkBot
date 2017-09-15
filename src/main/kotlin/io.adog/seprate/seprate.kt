package io.adog.seprate
import io.adog.lib.jarray

class seprate(){
    val segment: dynamic;
    val sentenceList: jarray;

    init {
        var segmenttemp = js("require('segment')");
        this.segment = js("new segmenttemp()");
        this.segment.useDefault();
        this.sentenceList = jarray();
    }

    public fun a(sentence: String){
        var b = sentence(sentence);
        this.sentenceList.push(b);
        console.log(this.sentenceList.list[0].w);
        return swapeAll(this.segment.doSegment(sentence));
    }

}