package io.adog.lib

class jarray() {
    val list: dynamic;
    var index = 0;

    init {
        this.list = js("[]");
    }

    public fun push(a: dynamic) {
        js("this.list.push(a)");
    }

    operator
    fun iterator(): Iterator<dynamic> {
        return Itr();
    }

    private inner class Itr : Iterator<dynamic> {
        override fun hasNext(): Boolean {
            return js("this.\$outer.index < this.\$outer.list.length");
        }

        override fun next() : dynamic {
            val b = js("this.\$outer.list[this.\$outer.index]");
            index ++;
            return b;
        }
    }
}
