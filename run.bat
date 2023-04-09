set projectLocation=D:\selenium-java\Xyz

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lin\*

java org.testng.TestNG %projectLocation%\testng.xml