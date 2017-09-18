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
function interval() {
    bash.getClip(function (out: string) {
        let a = out;
        if (a != clipboard) {
            clipboard = a;
            parseSentence(clipboard);
        }
        setTimeout(interval, 500);
    })
}

function parseSentence(parsing: string) {
    if (parsing.substring(0, 2) == "bk") {
        let mode = parsing.split('-')[0].substring(2);
        let content = parsing.split('-')[1];
        switch (mode) {
            case "教学":
                let sentence = content.split(">")[0];
                let response = content.split(">")[1];
                // console.log(sentence, response);
                console.log(s.learn_puj7f4$(sentence, response));
                break;
            case "数据":
                console.log("数据功能还没有开发出来");
                break;
            default:
        }
    } else {
        console.log(s.response_61zpoe$(parsing));
    }
}