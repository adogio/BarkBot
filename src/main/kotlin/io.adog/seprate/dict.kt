package io.adog.seprate

// POSTAG.D_A = 0x40000000; // 形容词 形语素
// POSTAG.D_B = 0x20000000; // 区别词 区别语素
// POSTAG.D_C = 0x10000000; // 连词 连语素
// POSTAG.D_D = 0x08000000; // 副词 副语素
// POSTAG.D_E = 0x04000000; // 叹词 叹语素
// POSTAG.D_F = 0x02000000; // 方位词 方位语素
// POSTAG.D_I = 0x01000000; // 成语
// POSTAG.D_L = 0x00800000; // 习语
// POSTAG.A_M = 0x00400000; // 数词 数语素
// POSTAG.D_MQ = 0x00200000; // 数量词
// POSTAG.D_N = 0x00100000; // 名词 名语素
// POSTAG.D_O = 0x00080000; // 拟声词
// POSTAG.D_P = 0x00040000; // 介词
// POSTAG.A_Q = 0x00020000; // 量词 量语素
// POSTAG.D_R = 0x00010000; // 代词 代语素
// POSTAG.D_S = 0x00008000; // 处所词
// POSTAG.D_T = 0x00004000; // 时间词
// POSTAG.D_U = 0x00002000; // 助词 助语素
// POSTAG.D_V = 0x00001000; // 动词 动语素
// POSTAG.D_W = 0x00000800; // 标点符号
// POSTAG.D_X = 0x00000400; // 非语素字
// POSTAG.D_Y = 0x00000200; // 语气词 语气语素
// POSTAG.D_Z = 0x00000100; // 状态词
// POSTAG.A_NR = 0x00000080; // 人名
// POSTAG.A_NS = 0x00000040; // 地名
// POSTAG.A_NT = 0x00000020; // 机构团体
// POSTAG.A_NX = 0x00000010; // 外文字符
// POSTAG.A_NZ = 0x00000008; // 其他专名
// POSTAG.D_ZH = 0x00000004; // 前接成分
// POSTAG.D_K = 0x00000002; // 后接成分
// POSTAG.UNK = 0x00000000; // 未知词性
// POSTAG.URL = 0x00000001; // 网址、邮箱地址

public fun dict(mode: dynamic){
    println(mode);
}

public fun swapeAll(seprated: dynamic): Array<dynamic>{
    var re = js("[]");
    for(i in seprated){
        var b = swape(i.p);
        js("re.push({w:i.w,p:b})");
    }
    return re;
}

public fun swape(postag: Int): String{
    var re: String;
    when {
        postag == 0x40000000 -> re = "adj"
        postag == 0x20000000 -> re = "dif"
        postag == 0x10000000 -> re = "con"
        postag == 0x08000000 -> re = "adv"
        postag == 0x04000000 -> re = "omg"
        postag == 0x02000000 -> re = "dir"
        postag == 0x01000000 -> re = "lon"
        postag == 0x00800000 -> re = "feq"
        postag == 0x00400000 -> re = "num"
        postag == 0x00200000 -> re = "nuw"
        postag == 0x00100000 -> re = "n"
        postag == 0x00080000 -> re = "snd"
        postag == 0x00040000 -> re = "use"
        postag == 0x00020000 -> re = "nun"
        postag == 0x00010000 -> re = "rep"
        postag == 0x00008000 -> re = "loc"
        postag == 0x00004000 -> re = "tim"
        postag == 0x00002000 -> re = "hlp"
        postag == 0x00001000 -> re = "v"
        postag == 0x00000800 -> re = "com"
        postag == 0x00000400 -> re = "prt"
        postag == 0x00000200 -> re = "nah"
        postag == 0x00000100 -> re = "buf"
        postag == 0x00000080 -> re = "nam"
        postag == 0x00000040 -> re = "plc"
        postag == 0x00000020 -> re = "org"
        postag == 0x00000010 -> re = "eng"
        postag == 0x00000008 -> re = "otr"
        postag == 0x00000004 -> re = "fnt"
        postag == 0x00000002 -> re = "bhd"
        postag == 0x00000000 -> re = "nul"
        postag == 0x00000001 -> re = "url"
        else -> re = "NAN"
    }
    return re;
}