echo "***************** Begin *****************"
set ZOOKEEPER_HOME=C:\software\zookeeper\apache-zookeeper-3.6.1-bin
echo 'ZOOKEEPER_HOME' %ZOOKEEPER_HOME%
set ZOOKEEPER_BIN="%ZOOKEEPER_HOME%\bin"
echo 'ZOOKEEPER_BIN' %ZOOKEEPER_BIN%
echo "***************** Starting zookeeper *****************"
call zkserver