package io.adog.seprate

class seprate(){
    val segment: dynamic;
    val sentenceList: Array<sentence>;

    init {
        var segmenttemp = js("require('segment')");
        this.segment = js("new segmenttemp()");
        this.segment.useDefault();
        this.sentenceList = js("[]");
    }

    public fun a(sentence: String){
        return swapeAll(this.segment.doSegment(sentence));
    }

}