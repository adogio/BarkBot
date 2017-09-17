package io.adog.ai
import io.adog.seprate.*
import io.adog.lib.jobj
    
var fs = js("require(\"fs\")");

public fun learn(sentence: sentence, response: String){
    // var contentText = fs.readFileSync("./test/test.txt");
    // var a = jobj(contentText);
    console.log(sentence.n().list);
}

public fun response(sentence: sentence): String{
    var b = "{}"
    var a = jobj(b);
    var c = jobj(b);
    c.add("zuoce", "dasd");
    a.add("zuoce", c.info());
    
    var d = jobj(a.info());
    console.log(d.g("zuoce"));
    return "test";
}