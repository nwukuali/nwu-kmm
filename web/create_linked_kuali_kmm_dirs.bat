@echo off
rem Creates necessary links to kuali kmm

IF NOT EXIST src\main\webapp GOTO LINKDIR
GOTO END

:LINKDIR
cd src\main
mklink /J webapp    ..\..\..\..\kuali-kmm\src\web\
mklink /J java    ..\..\..\..\kuali-kmm\src\java
mklink /J resources    ..\..\..\..\kuali-kmm\src\conf\project

