FROM java:8
RUN mkdir -p target/dependency
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
#EXPOSE 5000  #For Docker Deployment on AWS
ENTRYPOINT ["java","-cp","app:app/lib/*","nz.co.warehousegroup.springboot_sample.App"]
