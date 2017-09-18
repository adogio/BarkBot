package io.adog.lib

class jobj(json: String) {
    var json: dynamic;

    init{
        this.json = js("JSON.parse(json)");
    }

    public fun add(left: String, right: dynamic): dynamic {
        var l = left;
        if(left == js("undefined")){
            l = "default";
        }
        if(right.substring(0,1) == "\""||right.substring(0,1) == "["||right.substring(0,1) == "{"){
            js("this.json[l]=JSON.parse(right)");
        }else{
            js("this.json[l]=right");
        }
        return this;
    }

    public fun create(left: String): dynamic {
        if(!this.l(left)){
            if(left == js("undefined")){
                this.add("default", "{}");
            }else{
                this.add(left, "{}");
            }
        }
        return this;
    }

    public fun l(left: String): Boolean{
        if(left == js("undefined")){
            return js("Boolean(this.json.default)");
        }else{
            return js("Boolean(this.json[left])");
        }
    }

    public fun g(left: String): dynamic {  
        if(left == js("undefined")){
            return js("JSON.stringify(this.json.default)");
        } else{
            return js("JSON.stringify(this.json[left])");
        }        
    }

    public fun info(): String{
        return js("JSON.stringify(this.json)");
    }

}