# =====================================================
# BAI 1: DOCKERFILE - NGUYEN HAI DANG - 2280600668
# Multi-stage build: Giai doan 1 (Build) -> Giai doan 2 (Run)
# =====================================================

# --- GIAI DOAN 1: BUILD ---
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /app
COPY . .
# Bien dich code thanh file .jar (bo qua chay thu test de build nhanh)
RUN mvn package -DskipTests

# --- GIAI DOAN 2: RUN ---
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
# Chi lay file .jar tu builder (GD1)
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
# Lenh "bat cong tac" de chay ung dung
ENTRYPOINT ["java", "-jar", "app.jar"]

