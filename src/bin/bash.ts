import bashHelper from '../main/modules/bashHelper';

declare const require: any;

const bkbot = require('../../main/lunch');
const process = require('process');
const bash = new bashHelper();

let parseList = process.argv;
parseList.splice(0, 2);
let a = bkbot.io.adog.bkbot.bkbot
let s = a;
console.log(new s());
// bkbot.io.adog.bkbot.main_kand9s$(parseList);
// bash.setClip("test");
// interval();

// let clipboard = "";
// function interval() {
//     bash.getClip(function (out: string) {
//         let a = out;
//         if (a != clipboard) {
//             clipboard = a;
//             console.log(clipboard);
//         }
//         setTimeout(interval, 500);
//     })
// }