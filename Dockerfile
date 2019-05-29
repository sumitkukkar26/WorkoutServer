# Start with a base image containing Java runtime
#FROM openjdk:8
FROM aarshad88/workoutapp:0.0.1-SNAPSHOT
# Add a volume pointing to /tmp
VOLUME /tmp
# Make port 8081 available to the world outside this container
EXPOSE 8090
# The application's jar file
# ARG JAR_FILE=target/Workout-0.1.1-SNAPSHOT.jar
ARG JAR_FILE
# Add the application's jar to the container.
ADD ${JAR_FILE} /Workout-0.0.1-SNAPSHOT.jar
#  Run the jar file
ENTRYPOINT ["java","-jar","/Workout-0.0.1-SNAPSHOT.jar"]
  
