echo "***************** Begin *****************"
set KAFKA_HOME=C:\software\kafka_2.13-2.5.0
echo 'KAFKA_HOME' %KAFKA_HOME%
echo "***************** Creating the Console Producer *****************"
call %KAFKA_HOME%\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic token-update
pause
