## Simple servlet example to demonstrate a server side POST action for CIS4034

### To Run:
    - docker pull mbutler4/cis4034-post
    - docker run -it --rm -p 8888:8080 mbutler4/cis4034-post
    - access http://localhost:8888/servletpost/servpost in your local browser

### What'd I just see?
    - It's a very basic servlet running on Tomcat in a container from a .war file built via Maven.
    - The build of the Dockerfile is automated as a pipeline and is triggered with any checkins to the master branch.
