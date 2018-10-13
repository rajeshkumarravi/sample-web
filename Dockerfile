FROM tomcat:8.5.34-jre8

LABEL maintainer="Rajesh Kumar Ravi <rkr757@gmail.com>"

COPY build/libs/sample-web.war /usr/local/tomcat/webapps/sample-web.war

# local application port
EXPOSE 8080

CMD ["catalina.sh", "run"]