echo "***************** Begin *****************"
set KAFKA_HOME=C:\software\kafka_2.13-2.5.0
echo 'KAFKA_HOME' %KAFKA_HOME%
echo "***************** Starting kafka *****************"
call %KAFKA_HOME%\bin\windows\kafka-topics.bat --describe --zookeeper localhost:2181 --topic token-update
pause