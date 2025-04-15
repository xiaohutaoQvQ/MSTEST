# 使用 Eclipse Temurin 17 (Java 17) 作为基础镜像
FROM eclipse-temurin:17-jdk-alpine

# 设置工作目录
WORKDIR /app

# 复制 Maven 打包生成的 JAR 文件到镜像中
COPY target/MsTest-0.0.1-SNAPSHOT.jar app.jar

# 暴露 Spring Boot 默认端口（根据实际端口修改）
EXPOSE 9007

# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]