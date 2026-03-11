# Polyglot E-Commerce Checkout Engine 🚀

A scalable, microservices-based platform designed to streamline e-commerce operations and simplify the online selling experience. This project provides a **plug-and-play environment** for managing online carts and processing secure, seamless checkouts.

## 🏗 Architecture & Value Chain
This project demonstrates a distributed approach to e-commerce, separating high-frequency user interactions from secure transactional processing:

* **Checkout Service (Java):** An enterprise-grade engine built with **Java Spring Boot** to handle final order processing, status management, and secure data persistence.
* **Cart Management (Node.js Logic):** A lightweight, high-performance service layer for managing real-time cart states and user sessions.
* **Efficient Data Handling:** Utilizes **MongoDB** as a centralized NoSQL store to ensure high availability and fast document retrieval for orders.
* **Unified Frontend:** A sleek, modern Single Page Application (SPA) with a secure login flow, demonstrating how any frontend can connect to the managed backend services.



## ✨ Key Features (Designed for Swift)
* **Plug-and-Play Integration:** Headless REST API design allows for seamless connection across the entire e-commerce value chain.
* **Cross-Origin Support:** Configured for secure cross-domain communication between frontend and backend microservices.
* **Scalable Codebase:** Written with a focus on clean, maintainable code and modular software development principles.
* **Secure Checkout Flow:** Automated order validation and real-time MongoDB ID generation for every successful transaction.

## 💻 Technical Proficiencies
* **Languages:** Java (Spring Boot), JavaScript (Node.js ecosystem)
* **Database:** MongoDB (NoSQL)
* **Tools:** Git/Version Control, Gradle, REST Client Testing (cURL/Postman)
* **Principles:** RESTful API Design, Microservices Architecture, CORS Security

## 🚀 Getting Started
1.  **Backend:** Run the Spring Boot application using `./gradlew bootRun` on port 8080.
2.  **Frontend:** Open `index.html` in your browser.
3.  **Database:** Ensure a local instance of MongoDB is running.

## 🚀 Live Application Demo

### 1. Secure Authentication
The entry point of the application featuring a custom-styled login interface.
![Login Page](Screenshot%202026-03-11%20at%2021.42.56.jpg)

---

### 2. Product Catalog & Cart Management
Users can browse high-end tech products and manage their shopping cart in real-time.
![Storefront](Screenshot%202026-03-11%20at%2021.43.15.jpg)

---

### 3. Java Engine Verification & MongoDB Persistence
This is the core logic: the Java backend processes the payment and returns a unique MongoDB Object ID to confirm the data is saved.
![Checkout Success](Screenshot%202026-03-11%20at%2021.43.32.jpg)
