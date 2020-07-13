echo "***************** Begin *****************"
set KAFKA_HOME=C:\software\kafka_2.13-2.5.0
echo 'KAFKA_HOME' %KAFKA_HOME%
echo "***************** Starting kafka *****************"
call %KAFKA_HOME%\bin\windows\ kafka-run-class.bat kafka.admin.TopicCommand --delete --topic token-update --zookeeper localhost:2181
pause