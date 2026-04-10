# Transaction Service

## 🚀 Overview

This service is part of the Replikant system and is responsible for handling financial transactions.

It receives transaction requests, persists them in a relational database, and publishes events for downstream processing in a distributed architecture.

The goal of this service is to simulate how real-world financial systems process and record transactions in an event-driven environment.

---

## 🧱 Responsibilities

- Receive transaction requests via REST API
- Validate and process incoming data
- Persist transactions in PostgreSQL
- Publish transaction events to Kafka

---

## 🧰 Technologies

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Apache Kafka
- Docker / Docker Compose

---

## 📦 Infrastructure

This service runs inside a containerized environment and depends on external services such as:

- PostgreSQL for data persistence
- Apache Kafka for event streaming

---

## 🔄 Flow

```text id="flow1"
Client Request
     ↓
Transaction Service
     ↓
PostgreSQL (storage)
     ↓
Kafka (event publication)

This service is currently under development.