FROM maven:3-openjdk-17-slim AS maven
ARG BUILD_TARGET=tsg-backend

WORKDIR /build

COPY pom.xml .
COPY tsg-backend tsg-backend
COPY tsg-core tsg-core

RUN --mount=type=cache,target=/root/.m2 mvn -B clean package -pl :$BUILD_TARGET -am -DskipTests

# Copy the jar and build image
FROM eclipse-temurin:17-jre-alpine@sha256:c26a727c4883eb73d32351be8bacb3e70f390c2c94f078dc493495ed93c60c2f AS tsg-simulator

ARG UID=10000
ARG GID=1000

WORKDIR /app

COPY --chmod=755 --from=maven /build/tx-backend/target/tsg-backend-*-exec.jar app.jar

USER ${UID}:${GID}

ENTRYPOINT ["java", "-jar", "app.jar"]

HEALTHCHECK --interval=5m --timeout=3s \
  CMD curl -f http://localhost:4004/actuator/health || exit 1
