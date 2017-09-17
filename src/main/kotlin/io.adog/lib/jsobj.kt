package io.adog.lib

class jobj(json: String) {
    var json: dynamic;

    init{
        this.json = js("JSON.parse(json)");
    }

    public fun add(left: String, right: dynamic): dynamic {
        if(right.substring(0,1) == "\""||right.substring(0,1) == "["||right.substring(0,1) == "{"){
            js("this.json[left]=JSON.parse(right)");
        }else{
            js("this.json[left]=right");
        }
        return this;
    }
    
    public fun l(left: String): Boolean{
        return js("Boolean(this.json[left])");
    }

    public fun g(left: String): dynamic {     
        return js("JSON.stringify(this.json[left])");
    }

    public fun info(): String{
        return js("JSON.stringify(this.json)");
    }

}