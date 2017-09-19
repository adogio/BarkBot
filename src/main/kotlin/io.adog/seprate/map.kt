package io.adog.seprate
import io.adog.seprate.sentence
import io.adog.lib.*

fun getObj(sentence: sentence): Array<dynamic>{
    return sentence.p();
}

fun getVerb(sentence: sentence): jarray {
    return sentence.v();
}

fun getNone(sentence: sentence): jarray {
    return sentence.n();
}

fun getAdj(sentence: sentence): jarray {
    return sentence.t();
}

fun getAdv(sentence: sentence): jarray {
    return sentence.h();
}
