@echo off
setlocal enabledelayedexpansion

rem 使用 for 命令遍历目录中的 .proto 文件
for %%i in (".\*.proto") do (
    echo Found file: %%~nxi
    rem 在这里执行你想要的操作，比如调用 protoc_server.exe 生成对应的 Java 文件
    protoc_server.exe --java_out=..\..\MyRocket\src\main\java %%~nxi
)

endlocal

pause