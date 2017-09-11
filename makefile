
bkbot :
	gradle build

clean :
	rm -rf .gradle build
	rm -rf main/lunch main/*.js

run :
	node ./main/lunch.js