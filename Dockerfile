FROM tomcat:8.5.34-jre8

ARG CURR_DIR

LABEL maintainer="Rajesh Kumar Ravi <rkr757@gmail.com>"

WORKDIR $CURR_DIR

COPY $CURR_DIR/build/libs/sample-web.war /usr/local/tomcat/webapps/sample-web.war

# local application port
EXPOSE 8080

CMD ["catalina.sh", "run"]