# Usa JDK 21
FROM eclipse-temurin:21-jdk AS build

# Copia código-fonte pro container
WORKDIR /app

COPY . .

# Faz o build do projeto (gera o JAR)
RUN ./mvnw clean package -DskipTests

# -------------------------------
# Segunda stage: imagem mais leve
# -------------------------------
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copia o JAR gerado da stage anterior
COPY --from=build /app/target/lotro-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
