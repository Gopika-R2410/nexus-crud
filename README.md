# Nexus – Full-Stack Supermarket POS & Inventory Management System

Nexus is a responsive, high-performance asset management and point-of-sale (POS) application. It bridges a modern, responsive glassmorphic user interface with a robust, type-safe Java backend server to handle real-time inventory adjustments and transaction checkouts.

## 🚀 Features

- **Live Stockroom Dashboard:** Dynamic retrieval and rendering of current database inventory status.
- **Real-Time Data Ingestion:** Securely add, update, or remove supermarket products with immediate persistence.
- **POS Billing Counter:** Interactive customer checkout interface complete with dynamic quantity adjustments and automatic price calculation.
- **Automated Stock Deductions:** Real-time background database subtraction upon checkout completions, instantly pushing out-of-stock items to a dedicated depleted assets tracker.
- **Modern Glassmorphism UI:** Fully responsive design built with Tailwind CSS, utilizing asynchronous fetch streams for a seamless single-page application experience.

## Here you can get into my website : https://gopika-r2410.github.io/nexus-crud/ 

## 🛠️ Tech Stack

### Frontend
- **HTML5 & Tailwind CSS:** Styled using modern glassmorphic glass-card aesthetics.
- **JavaScript (ES6+):** Pure async/await programming leveraging the native Fetch API to map request payloads directly to RESTful endpoints without page reloads.

### Backend
- **Java 25 & Spring Boot 4.x:** Core application framework managing component scanning, runtime architectures, and request delegation.
- **Spring Data JPA & Hibernate:** ORM abstraction Layer mapping database states to structural models and managing ACID-compliant database operations.
- **Apache Maven:** Dependency configuration and lifecycle build lifecycle automation.

### Database & Security
- **MySQL Server:** Relational relational storage preserving asset records.
- **CORS Configuration:** Fully configured Cross-Origin Resource Sharing rules allowing decoupled frontend execution.

## Some shots of my website pages to flex my UI 
<img width="1902" height="580" alt="image" src="https://github.com/user-attachments/assets/fb8b7575-2752-4a94-bf12-118f1f9d6ab7" />
<img width="1535" height="798" alt="image" src="https://github.com/user-attachments/assets/c001b150-8696-4085-bae1-ef1b795a5c02" />
<img width="1499" height="688" alt="image" src="https://github.com/user-attachments/assets/ba0d528b-f707-4c22-bffd-5a04ec9e4310" />

## 📂 Project Directory Structure

```text
nexus-crud/
├── frontend/
│   ├── index.html        # Glassmorphism POS interface & Application Logic
│   └── app.js            # Frontend JavaScript controller logic
├── src/
│   ├── main/
│   │   ├── java/com/nexus/management/
│   │   │   ├── controller/
│   │   │   │   └── ProductController.java    # REST API endpoints mapping
│   │   │   ├── model/
│   │   │   │   └── Product.java              # Database JPA Entity
│   │   │   ├── repository/
│   │   │   │   └── ProductRepository.java    # JPA Data layer operations
│   │   │   └── NexusCrudApplication.java     # Main Application Bootstrap
│   │   └── resources/
│   │       └── application.properties        # Database & Server configuration
└── pom.xml                                   # Maven Dependencies Configuration
```
The **Nexus Asset & Inventory Management System** serves as a dual-purpose solution designed for modern, high-paced retail environments:
 * **Real-Time Checkout Automation:** Cashiers can use the dedicated point-of-sale (POS) billing counter to instantly process client purchases. The system automatically computes final bills, removing the need for manual bookkeeping and expediting transaction lines.
 * **Dynamic Stockroom Control:** Store owners and inventory managers can effortlessly handle full-stack CRUD operations. The intake form allows for rapid stock registration, updating quantities instantly across the dashboard.
 * **Algorithmic Waste & Depletion Prevention:** By tracking asset counts, Nexus prevents accidental overselling. Out-of-stock products automatically transition to a specialized "Sold Out" tracker, flagging necessary reorder points immediately.
 * **Cross-Platform Performance:** Leveraging an asynchronous decoupled design, the glassmorphic interface handles heavy system requests concurrently without refreshing, providing smooth data persistence on any standard local terminal.

## Built and developed by Gopika Ravi. Feel free to explore the repository and connect with me on LinkedIn!

