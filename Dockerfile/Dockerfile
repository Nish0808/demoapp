FROM tomcat:9.0

User root
RUN rm -rf webapps
RUN mv webapps.dist webapps
COPY demoapp.war /usr/local/tomcat/webapps/demoapp.war

