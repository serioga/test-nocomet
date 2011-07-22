set SCRIPT_DIR=%~dp0
java -Xmx512M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M -jar "%SCRIPT_DIR%\sbt-launcher.jar" %*
