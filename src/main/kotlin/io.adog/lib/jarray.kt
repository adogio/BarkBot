package io.adog.lib

class jarray() {
    var list: dynamic;
    var undo: dynamic;
    var index = 0;

    init {
        this.list = js("[]");
        this.undo = null;
    }

    public fun push(a: dynamic) {
        js("this.list.push(a)");
        this.undo = a;
        return this.list;
    }

    public fun pop(){
        var pop = js("this.list.pop()");
        this.undo = pop;
        return pop;
    }

    public fun clean(){
        this.list = js("[]");
        this.undo = null;
    }
    
    public fun get(target: Int){
        return js("this.list[target]");
    }

    operator
    fun iterator(): Iterator<dynamic> {
        return Itr();
    }

    private inner class Itr : Iterator<dynamic> {
        override fun hasNext(): Boolean {
            var hasNext = js("this.\$outer.index < this.\$outer.list.length");
            if(!hasNext){
                index = 0;
            }
            return hasNext;
        }

        override fun next() : dynamic {
            val b = js("this.\$outer.list[this.\$outer.index]");
            index ++;
            return b;
        }
    }
}
