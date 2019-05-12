# springboot-docker-spotify

Steps to run the project in Docker

1) To run the project, first build it using maven using the command below:
        mvn clean compile install docker:build
   This will create a docker file and .jar into your target folder under resource.  

2) Now check for the docker image file for your project that is added in the docker, using the command `docker images` in the      terminal.

3) To run that docker image in the docker container, run the command as follows:
    `docker run -it -p host-port:conatiner-port dockerImageName`.
    
    `-it` is for interactive mode, which is host machine port.
    `-p` is for the container port, using which we are mapping the container port with host machine port.
    `host-port` is the port on which we want container to run.
    `conatiner-port` is the port which is specified in the .jar file
  
  So, in out case the command would be `docker run -it -p 9999:8888 dockerdemo`.

If no error occurs than you can access the application using `localhost:9999/{yourName}`


`docker images` to check already create images.
`docker ps` to check already running docker containers.
