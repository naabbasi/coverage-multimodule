SonarQube server 8.1x

mvn clean verify sonar:sonar -Dsonar.host.url=http://hostname:9000 -Dsonar.login=admin -Dsonar.password=admin -Pcoverage
