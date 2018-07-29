# Pull base image 
From tomcat:8-jre8 

# Maintainer 
MAINTAINER "murray.butler@gmail.com" 

#ADD settings.xml /usr/local/tomcat/conf/
#ADD tomcat-users.xml /usr/local/tomcat/conf/

# Copy to images tomcat path 
#ADD webapp/WEB-INF/web.xml /usr/local/tomcat/conf/ 
#ADD obclient.properties /etc/ 
#ADD WebClient.properties /etc/ 
COPY target/servletpost.war /usr/local/tomcat/webapps/