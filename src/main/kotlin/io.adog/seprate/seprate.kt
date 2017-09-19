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

    public fun obj(): Any{
        //TODO
        var a: dynamic = this.sentenceList.get(0);
        return a.p();
    }

    public fun sen(): sentence{
        //TODO
        var a: dynamic = this.sentenceList.get(0);
        return a;
    }

    public fun clean(): Int{
        this.sentenceList.clean();
        return 1;
    }
}