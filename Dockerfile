# Pull base image 
From tomcat:8-jre8 

# Maintainer 
MAINTAINER "murray.butler@gmail.com" 

# Copy to images tomcat path 
COPY target/servletpost.war /usr/local/tomcat/webapps/