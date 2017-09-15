package io.adog.seprate
import io.adog.lib.jarray

class seprate(){
    val segment: dynamic;
    var sentenceList: jarray;

    init {
        var segmenttemp = js("require('segment')");
        this.segment = js("new segmenttemp()");
        this.segment.useDefault();
        this.sentenceList = jarray();
    }

    public fun a(sentence: String){
        var b = sentence(sentence, this.segment);
        this.sentenceList.push(b);
    }

    public fun log(){
        for(i in this.sentenceList){
            console.log(getObj(i));
        }
    }

}