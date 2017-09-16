# Makefile For BarkBot version 0.1.1

# build with kotlinc
# bkbot :
# 	kotlinc-js -output build/lunch.js src/main.kt

# build with gradle
bkbot : gradleBuild tsBuild
	echo done
	
gradleBuild :
	gradle build

o : tsBuild test

tsBuild :
	tsc

# clean with gradle
clean :
# paths
	rm -rf .classpath .project
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

# ------------------------------------
# run with gradle
run :
	node ./src/bin/bash.js

# run with kotlinc
# run :
# 	node ./build/lunch.js

# ------------------------------------
# run with packaged glue file
r :
	node ./src/bin/bash.js $(A)

test :
	node ./src/bin/bash.js 测试测试测试

opt :
	echo $(A) | tee tmp.file.txt
	xclip -selection clipboard < tmp.file.txt
	rm tmp.file.txt
