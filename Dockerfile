FROM openjdk:17-alpine
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar

# THE FROM instruction specifies the Parent Image from which you are building
# The WORKDIR command is used to define the working directory of a Docker container at any given time.Any RUN, CMD, ADD, COPY,or ENTRYPOINT
# The ENV instruction is used to define environment variables
# The EXPOSE instruction informs Docker that the container listens on the specified network ports at runtime.
# The ENTRYPOINT instruction is used to configure the executables that will always run after the container Initiated.
