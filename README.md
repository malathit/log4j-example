# log4j-example
A sample java program that makes use of log4j to write logs to file every second

###Command to compile the program
javac -cp .:./lib/* log4jExample.java

###Command to run the program
java -cp .:./lib/* -Dlog4j.configurationFile=conf.xml log4jExample
