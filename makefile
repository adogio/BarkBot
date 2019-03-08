# build with gradle
main : gradleBuild tsBuild

o : tsBuild test

run : tsBuild r

# clean with gradle
clean :
# paths
	rm -rf .classpath .project npm-debug.log
# folders
	rm -rf bin .settings .gradle build main
# typeScripts
	rm -rf src/bin/*.js src/main/modules/*.js

reset :
	echo {} > ./test/test.json
	echo [] > ./test/bug.json


tsBuild :
	tsc --p typescript/tsconfig.build.json

r :
	node ./src/bin/bash.js

opt :
	echo $(A) | tee tmp.file.txt
	xclip -selection clipboard < tmp.file.txt
	rm tmp.file.txt

gradleBuild :
	gradle build

install:
	@echo "[INFO] Installing dev Dependencies"
	@yarn install --production=false

install-prod:
	@echo "[INFO] Installing Dependencies"
	@yarn install --production=true
