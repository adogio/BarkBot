const exec = require("child_process").exec;

class bashHelper {
    os: string;
    constructor() {
        this.os = "linux";
    }

    setClip(clip: string) {
        switch (this.os) {
            case "linux":
                exec("echo " + clip + " | xclip -selection c");
            default:
        }
    }

    getClip() {
        switch (this.os) {
            case "linux":
                exec("xclip -selection c -o");
            default:
        }
    }

}

export { bashHelper as default }