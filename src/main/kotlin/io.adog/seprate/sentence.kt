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
        this.segment.loadSynonymDict("synonym.txt");
        // this.segment.loadStopwordDict("stopword.txt");
        var a: dynamic = null;
        js("a = {}")
        js("a.convertSynonym = true");
        // js("a.stripStopword = true");
        // js("a.stripPunctuation = true");
        this.parsed = swapeAll(this.segment.doSegment(this.sentence, a));
    }

    public fun p(): Array<dynamic> {
        return this.parsed;
    }

    public fun s(): String {
        return this.sentence;
    }

    public fun n(): jarray {
        var re = jarray();
        for(i in parsed){
            if(js("i.p") == "n"){
                re.push(js("i.w"))
            }
        }
        return re;
    }

    public fun v(): jarray {
        var re = jarray();
        for(i in parsed){
            if(js("i.p") == "v"){
                re.push(js("i.w"))
            }
        }
        return re;
    }

    public fun w(): jarray {
        var re = jarray();
        for(i in parsed){
            if(js("i.p") == "eng"||js("i.p") == "otr"||js("i.p") == "nul"||js("i.p") == "NAN"||js("i.p") == "omg"||js("i.p") == "prt"){
                re.push(js("i.w"))
            }
        }
        return re;
    }

    public fun t(): jarray {
        var re = jarray();
        for(i in parsed){
            if(js("i.p") == "tim"||js("i.p") == "loc"){
                re.push(js("i.w"))
            }
        }
        return re;
    }

    public fun h(): jarray {
        var re = jarray();
        for(i in parsed){
            if(js("i.p") == "num"||js("i.p") == "nuw"||js("i.p") == "nun"||js("i.p") == "rep"||js("i.p") == "buf"){
                re.push(js("i.w"))
            }
        }
        return re;
    }
    
}