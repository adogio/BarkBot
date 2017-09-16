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

    public fun a(sen: String){
        var b = sentence(sen, this.segment);
        this.sentenceList.push(b);
    }

    public fun log(){
        for(i in this.sentenceList){
            console.log(getObj(i));
        }
    }

    public fun clean(): Int{
        this.sentenceList.clean();
        return 1;
    }
}