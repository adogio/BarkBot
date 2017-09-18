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
            console.log(counter, clipboard, a)
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
            case "学习":
                let sentence = content.split(">")[0];
                let response = content.split(">")[1];
                // logger(sentence, response);
                logger(s.learn_puj7f4$(sentence, response));
                break;
            case "数据":
                logger("数据功能还没有开发出来");
                break;
            default:
        }
    } else {
        logger(s.response_61zpoe$(parsing));
    }
}
function hello() {
    logger("我是基于ItChat和BkBot的微信机器人, 在线期间我会自动回复我能回答的问题. 你可以输入'$帮助'查看可以使用的命令. BkBot目前还在测试阶段, 链接稳定性较差, 你可以输入'$反馈-[反馈的内容]'来反馈bug.");
}

function help() {
    logger("可用的命令: $学习-[反应语素]>[回答方式], $反馈-[反馈的内容], $帮助, $数据-[记录项目]");
}

function logger(str: string) {
    counter++;
    if (str == undefined) {
        bash.setClip("这个命令没有可以反馈的语法");
        clipboard = "这个命令没有可以反馈的语法";
        console.log("这个命令没有可以反馈的语法");
    } else {
        bash.setClip(str);
        clipboard = str;
        console.log(str);
    }
}