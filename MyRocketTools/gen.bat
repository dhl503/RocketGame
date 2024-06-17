set WORKSPACE=.
set LUBAN_DLL=%WORKSPACE%\LubanTools\Luban\Luban.dll
set CONF_ROOT=.

dotnet %LUBAN_DLL% ^
    -t all ^
    -c java-json ^
    -d json ^
    --conf %CONF_ROOT%\luban.conf ^
    -x outputDataDir=..\MyRocket\src\main\resources\GenerateJsons ^
    -x outputCodeDir=..\MyRocket\src\main\java\cfg

pause