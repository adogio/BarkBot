# Makefile For BarkBot version 0.1.1

# build with kotlinc
# bkbot :
# 	kotlinc-js -output build/lunch.js src/main.kt

# build with gradle
bkbot : gradleBuild tsBuild
	echo done

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

# clean with kotlinc
# clean :
# 	rm -rf build/*.js
# 	rm -rf build/lunch
# typeScripts
#	rm -rf src/bin/*.js src/main/module/*.js

reset :
	echo {} > ./test/test.json
	echo [] > ./test/bug.json


tsBuild :
	tsc

# ------------------------------------
# run with gradle
r :
	node ./src/bin/bash.js

# run with kotlinc
# run :
# 	node ./build/lunch.js

# ------------------------------------
# run with packaged glue file

opt :
	echo $(A) | tee tmp.file.txt
	xclip -selection clipboard < tmp.file.txt
	rm tmp.file.txt

	
gradleBuild :
	gradle build