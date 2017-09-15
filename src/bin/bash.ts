declare let require: any;

const bkbot = require('../../main/lunch');
const process = require('process');

let parseList = process.argv;
parseList.splice(0, 2);

bkbot.io.adog.bkbot.main_kand9s$(parseList);