import bashHelper from '../main/modules/bashHelper';

declare const require: any;

const bkbot = require('../../main/lunch');
const bash = new bashHelper();
let a = bkbot.io.adog.bkbot.bkbot
let s = new a();
// bkbot.io.adog.bkbot.main_kand9s$(parseList);
// bash.setClip("test");

interval();

let clipboard = "";
let counter = 0;

function interval() {
    bash.getClip(function (out: string) {
        let a = out;
        if (a != clipboard) {
            clipboard = a;
            if (counter != 0) {
                parseSentence(clipboard);
            } else {
                hello();
            }
        }
        setTimeout(interval, 500);
    })
}

function parseSentence(parsing: string) {
    if (parsing.substring(0, 1) == "$") {
        let mode = parsing.split('-')[0].substring(1);
        let content = parsing.split('-')[1];
        switch (mode) {
            case "反馈":
                logger(s.bug_61zpoe$(content));
                break;
            case "帮助":
                help();
                break;
            case "分析":
                logger(s.language_61zpoe$(content));
                break;
            case "学习":
                if (!Boolean(content)) {
                    logger("学习的正确格式是 $学习-[反应语素]>[回答方式]");
                }
                let sentence = content.split(">")[0];
                let response = content.split(">")[1];
                logger(s.learn_puj7f4$(sentence, response));
                break;
            case "数据":
                logger("数据功能还没有开发出来");
                break;
            case "关于":
                logger("我是基于 BarkBot (Github.com/adogio/barkbot) 和 ItChat (https://github.com/littlecodersh/ItChat) 的微信机器人, 采用 CC-BA-SA 4.0 协议开源. 你可以用$反馈-[反馈的内容] 命令反馈你发现的 bug.")
            default:
                logger("$" + mode + " 不是一个有效的命令");
        }
    } else {
        logger(s.response_61zpoe$(parsing));
    }
}
function hello() {
    logger("我是基于ItChat和BkBot的微信机器人, 在线期间我会自动回复我能回答的问题.\n 你可以输入'$帮助'查看可以使用的命令.\n BkBot目前还在测试阶段, 链接稳定性较差, 你可以输入'$反馈-[反馈的内容]'来反馈bug.");
}

function help() {
    logger("可用的命令:\n $学习-[问题]>[回答方式]\n $反馈-[反馈的内容]\n $帮助\n $数据-[记录项目]\n $分析-[句子]\n $关于");
}

function logger(str: string) {
    counter++;
    if (str == undefined) {
        bash.setClip("这个命令没有可以反馈的语法");
        if (bash.getOS() != "linux") clipboard = "这个命令没有可以反馈的语法";
        console.log("这个命令没有可以反馈的语法");
    } else {
        bash.setClip(str);
        if (bash.getOS() != "linux") clipboard = str;
        console.log(str);
    }
}
