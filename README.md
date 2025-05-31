# ChromeDevTools_Selenuim
Java-based Selenium WebDriver scripts using Chrome DevTools Protocol (CDP) for advanced browser automation — including network mocking, console log capture, mobile emulation, geolocation spoofing, basic auth handling, and JDBC connectivity.

# Selenium Advanced Utilities with Java & CDP

This repository provides a collection of Java-based Selenium WebDriver utilities leveraging Chrome DevTools Protocol (CDP). These scripts support advanced browser automation and are useful for simulating various real-world test scenarios.

## 📁 Files & Descriptions

| File Name                  | Purpose |
|---------------------------|---------|
| `BasicAuthentication.java`   | Handles HTTP basic auth via ChromeOptions. |
| `CdpCommandTest.java`        | Sends custom CDP commands via WebDriver. |
| `ConsoleLogsCapture.java`    | Captures and logs browser console output. |
| `JdbConnection.java`         | Connects to a database using JDBC. |
| `MobileEmulatorTest.java`    | Emulates mobile device behavior in Chrome. |
| `NetworkFailedRequests.java` | Logs failed network requests. |
| `NetworkLogActivity.java`    | Tracks network request and response logs. |
| `NetworkMocking.java`        | Mocks network responses with CDP. |
| `NetworkSpeed.java`          | Simulates network throttling conditions. |
| `SetGeoLocation.java`        | Sets browser location for geolocation testing. |

## 🛠 Requirements

- Java 8+
- Maven
- Selenium WebDriver
- ChromeDriver
- TestNG or JUnit (optional)

## 🚀 Quick Start

```bash
git clone https://github.com/yourusername/selenium-advanced-utilities.git
cd selenium-advanced-utilities
mvn clean install
