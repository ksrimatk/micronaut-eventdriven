echo "***************** Begin *****************"
set KAFKA_HOME=C:\software\kafka_2.13-2.5.0
echo 'KAFKA_HOME' %KAFKA_HOME%
echo "***************** Creating the Console Consumer *****************"
call %KAFKA_HOME%\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic token-update
pause
