echo "***************** Begin *****************"
set KAFKA_HOME=C:\software\kafka_2.13-2.5.0
echo 'KAFKA_HOME' %KAFKA_HOME%
echo "***************** Craeting the Topic*****************"
call %KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic token-update
pause
