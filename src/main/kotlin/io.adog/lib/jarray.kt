package io.adog.lib

class jarray() {
    val list: dynamic;

    init {
        this.list = js("[]");
    }

    public fun push(a: dynamic) {
        js("this.list.push(a)");
    }

    open fun iterator(){
        return {
            fun next(){
                return 1;
            }
            fun hasNext(){
                return true;
            }
        };
    }
}
