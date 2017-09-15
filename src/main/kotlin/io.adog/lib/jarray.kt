package io.adog.lib

class jarray() {
    val list: dynamic;

    init {
        this.list = js("[]");
    }

    public fun push(a: dynamic) {
        js("this.list.push(a)");
    }
}
