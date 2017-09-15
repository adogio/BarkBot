
# build with kotlinc
# bkbot :
# 	kotlinc-js -output build/lunch.js src/main.kt

# build with gradle
bkbot : gradleBuild tsBuild
	echo done
	
gradleBuild :
	gradle build

tsBuild :
	tsc

# clean with gradle
clean :
# paths
	rm -rf .classpath .project
# folders
	rm -rf bin .settings .gradle build main
# typeScripts
	rm -rf src/bin/*.js src/main/module/*.js

# clean with kotlinc
# clean :
# 	rm -rf build/*.js
# 	rm -rf build/lunch
# typeScripts
#	rm -rf src/bin/*.js src/main/module/*.js

# ------------------------------------
# run with gradle
run :
	node ./main/lunch.js

# run with kotlinc
# run :
# 	node ./build/lunch.js

# ------------------------------------
# run with packaged glue file
r :
	node ./src/bin/bkbot.js