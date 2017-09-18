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

    public fun learn(sentence: String, response: String): String {
        this.sep.a(sentence);
        var a: String = learn(this.sep.sen(), response);
        this.sep.clean();
        return a;
    }

    public fun response(sentence: String): String {
        this.sep.a(sentence);
        var a: String = response(this.sep.sen());
        this.sep.clean();
        return a;
    }

    public fun bug(content: String): String {
        return bugR(content);
    }

    public fun language(sentence: String): String {
        this.sep.a(sentence);
        var a: String = this.langaugeParse(languageR(this.sep.sen()));
        this.sep.clean();
        return a;
    }

    public fun langaugeParse(content: Array<dynamic>): String{
        var re = jarray();
        for(i in content){
            re.push("< 词语: " + js("i.w") + " | 词性 : " + reverse(js("i.p")) + " >");
        }
        console.log(re.list)
        return "A"
    }
}