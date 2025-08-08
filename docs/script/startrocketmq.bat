@echo off
rem 启动Name Server
start mqnamesrv.cmd
echo Name Server正在启动...
rem 等待一段时间，确保Name Server启动完成，这里等待5秒，可根据实际情况调整
ping -n 5 127.0.0.1 >nul
rem 启动Broker，并指定Name Server地址
set NAMESRV_ADDR=127.0.0.1:9876
start mqbroker.cmd -n %NAMESRV_ADDR% autoCreateTopicEnable=true
echo Broker正在启动...