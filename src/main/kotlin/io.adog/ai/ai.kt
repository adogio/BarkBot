package io.adog.ai
import io.adog.seprate.*
import io.adog.lib.jobj
    
var fs = js("require(\"fs\")");

public fun learn(sentence: sentence, response: String): String {
    var contentText = fs.readFileSync("./test/test.json");
    var file = jobj(contentText);
    var str = "temp";

    var v = sentence.v();
    var n = sentence.n();
    var w = sentence.w();
    var t = sentence.t();
    var h = sentence.h();

    if(v.length()>1||n.length()>1||w.length()>1||h.length()>1||t.length()>1){
        str = "句子的元素过于复杂, 请酌情减少元素内容, 你可以用 \$分析-[句子] 命令查看其中的语素来优化你的句子来增加识别率.";
        return str;
    }
    file.create(v.get(0));

    var leveln = jobj(file.g(v.get(0)));
    leveln.create(n.get(0));
    var levelw = jobj(leveln.g(n.get(0)));
    levelw.create(w.get(0));
    var levelt = jobj(levelw.g(w.get(0)));
    levelt.create(t.get(0));
    var levelh = jobj(levelt.g(t.get(0)));

    if(levelh.l(h.get(0))){
        str = "这个问题已经学会了, 上次教的回答是" + levelh.g(h.get(0));
    }else{
        levelh.add(h.get(0), response);
        str = "这个回答方式已经被记下了, 以后我就会这么回答这个问题";
    }

    levelt.add(t.get(0), levelh.info())
    levelw.add(w.get(0), levelt.info());
    leveln.add(n.get(0), levelw.info());
    file.add(v.get(0),leveln.info());

    fs.writeFileSync("./test/test.json", file.info());
    return str;
}

public fun response(sentence: sentence): String {
    var contentText = fs.readFileSync("./test/test.json");
    var file = jobj(contentText);
    var str = "temp";

    var v = sentence.v();
    var n = sentence.n();
    var w = sentence.w();
    var t = sentence.t();
    var h = sentence.h();

    file.create(v.get(0));
    var leveln = jobj(file.g(v.get(0)));
    leveln.create(n.get(0));
    var levelw = jobj(leveln.g(n.get(0)));
    levelw.create(w.get(0));
    var levelt = jobj(levelw.g(w.get(0)));
    levelt.create(t.get(0));
    var levelh = jobj(levelt.g(t.get(0)));
    str = levelh.g(h.get(0));

    return js("JSON.parse(str)");
}

public fun bugR(content: String): String {
    var contentText = fs.readFileSync("./test/bug.json");

    var str = "";

    var parsed = js("JSON.parse(contentText)");
    js("parsed.push(content)");

    fs.writeFileSync("./test/bug.json", js("JSON.stringify(parsed)"));

    str = "反馈的bug已经被记录了. 感谢.";

    return str;
}

public fun languageR(sentence: sentence): Array<dynamic> {
    return sentence.p();
}