 FROM adoptopenjdk/openjdk15:ubi
 RUN mkdir /usr/app/
 ENV APP_HOME=/usr/app/
 WORKDIR $APP_HOME
 COPY app.jar app.jar
 COPY snf_linux.tar snf_linux.tar
 CMD ["java", "-jar", "app.jar"]