declare const require: any;

const exec = require('child_process').exec;
const escape = require('shell-escape');
const os = require('os');

class bashHelper {
    os: string;
    constructor() {
        this.os = os.platform();
    }

    setClip(str: string) {
        let fun: Function = null;
        switch (this.os) {
            case 'freebsd': fun = (str, fn) => {
                execute('xsel -i -b', str, fn);
            }
                break;
            case 'win32': fun = (str, fn) => {
                execute('clip', str, fn);
            }
                break;
            case 'linux': fun = (str, fn) => {
                // let cmd = 'make opt A="' + str + '"';
                // exec(cmd, fn || function () { });
            }
                break;
            case 'darwin': fun = (str, fn) => {
                execute('pbcopy', str, fn);
            }
                break;
            default:
        }

        fun(str, function (error, stdout, stderr) {
            if (stdout) console.log('stdout: ' + stdout);
            if (stderr) console.log('stderr: ' + stderr);
            if (error !== null) {
                console.log('exec error: ' + error);
            }
        })

        function execute(program, str, fn) {
            var cmd = escape(['printf', str]) + ' | ' + program;
            exec(cmd, fn || function () { });
        }
    }

    getOS() {
        return this.os;
    }

    getClip(fun: Function) {
        switch (this.os) {
            case "linux":
                exec("xclip -selection clipboard -o",
                    function (error, stdout, stderr) {
                        fun(stdout);
                        // console.log('stdout: ' + stdout);
                        // console.log('stderr: ' + stderr);
                        if (error !== null) {
                            console.log('exec error: ' + error);
                        }
                    });
                break;
            case "darwin":
                exec("pbpaste",
                    function (error, stdout, stderr) {
                        fun(stdout);
                        // console.log('stdout: ' + stdout);
                        // console.log('stderr: ' + stderr);
                        if (error !== null) {
                            console.log('exec error: ' + error);
                        }
                    });
                break;
            default:
        }
    }

}

export { bashHelper as default }