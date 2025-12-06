🐔 Sadabahar Chicken Point – Online Shopping Web Application

A production-style, full-stack restaurant ordering platform offering online menu browsing, offers, authentication, and a premium UI/UX.
Built using Java Servlets, JSP, MySQL, and modern frontend technologies, this project follows clean architecture principles similar to professional food-ordering websites.

<p align="center">
  🚀 Demo GIF coming soon – work in progress.
</p>
<img width="1760" height="909" alt="Screenshot 2025-12-06 233400" src="https://github.com/user-attachments/assets/41ebc92e-da38-49b1-9031-0121719a1f47" />

📌 Overview

Sadabahar Chicken Point is a modern restaurant web app built to simulate real-world food ordering systems.
It includes a dark theme, auth system, menu display, offers section, contact page, and a seamless UI optimized for desktops & mobile devices.

This project demonstrates strong skills in:

✔ Full-stack Java development
✔ Clean backend architecture
✔ Responsive UI/UX
✔ JDBC + MySQL integration
✔ Real-world servlet-based application design
✔ Deployment-ready web project

🏆 Key Features
🍗 Dynamic Menu System

Showcases chicken buckets, biryani, rolls, pieces, snacks, etc.

Modern card UI with animations

Fully responsive with optimized spacing and typography

🎁 Offers & Deals

Dedicated offers page

Coupon-like UI cards

Highlighted deals (Flat 50%, Buy 1 Get 1, etc.)

🔐 User Authentication

Login using Email OR Mobile Number

Input validation

Session-based authentication

Clean redirection with modern UI pages

(Optional) BCrypt password hashing support

🌙 Theme Ready Design

Polished dark UI

Neon gradients

Professional restaurant-style visuals

📞 Contact Page

Form for user inquiries

Restaurant address + phone details

Clean structured layout

🎨 Premium UI/UX

Inspired by top food delivery apps

Card-based system

Smooth hover transitions

Elegant dark theme layout

🛠️ Tech Stack
Frontend

HTML5

CSS3

JavaScript (ES6+)

Google Fonts – Poppins

Backend

Java Servlets

JSP (optional)

JDBC

Apache Tomcat 9/10

Database

MySQL

Table: userregister

🧱 Architecture
## 🧱 Architecture

The application follows a classic **3-tier architecture**:

1. **Presentation Layer (Client UI)**
   - HTML pages: `Home.html`, `menu.html`, `offers.html`, `contact.html`, `Register.html`, `Login.jsp`
   - Styling with CSS (dark theme, gradients, responsive layout)
   - Basic interactivity using JavaScript (form handling, navigation)

2. **Application Layer (Servlet Backend)**
   - Runs on **Apache Tomcat**
   - Core servlets:
     - `LoginServlet` – handles email/phone + password login
     - `RegisterServlet` – saves new user into database
     - `WelcomeServ` – post-login landing controller
   - Uses **JDBC** to talk to the database via `ConnectionProvider`
   - Implements login logic:
     - Detects whether input is **email or mobile number**
     - Normalizes phone numbers (removing spaces, +91 etc.)
     - Validates credentials and manages HTTP session

3. **Data Layer (MySQL Database)**
   - MySQL database: `chickenpoint`
   - Main table: `userregister`
     - `FullName`, `Email`, `MobileNumber`, `DeliveryAddress`, `Password`
   - JDBC-based queries:
     - `SELECT * FROM userregister WHERE Email=? AND Password=?`
     - `SELECT * FROM userregister WHERE MobileNumber=? AND Password=?`
   - Connection handled via `ConnectionProvider` utility class


📂 Project Directory Structure
<p align="center"><img width="670" height="694" alt="Screenshot 2025-12-06 174910" src="https://github.com/user-attachments/assets/a6c6fbd0-7be2-46a3-9a1a-86c789829c72" /> </p>

⚙️ Installation & Setup
1️⃣ Clone the Repository
git clone https://github.com/shadab04/Sadabahar-Chicken-Point-OnlineShoppingWebApplication.git

2️⃣ Import into IDE

Eclipse → File → Import → Dynamic Web Project
OR
IntelliJ → New → Project from Existing Sources

3️⃣ Configure Tomcat

Add server → Apache Tomcat 9/10

Deploy project

Start server

4️⃣ Setup MySQL
CREATE DATABASE chickenpoint;
USE chickenpoint;

CREATE TABLE userregister (
  FullName VARCHAR(100),
  Email VARCHAR(100),
  MobileNumber VARCHAR(20),
  DeliveryAddress VARCHAR(255),
  Password VARCHAR(50)
);

5️⃣ Configure DB Connection

In ConnectionProvider.java:

con = DriverManager.getConnection(
  "jdbc:mysql://localhost:3306/chickenpoint",
  "root",
  "yourpassword"
);

6️⃣ Run the App

Open:

http://localhost:8080/OnlineShoppingProject/Home.html

🔐 Authentication Workflow

1️⃣ User enters email/mobile + password
2️⃣ Servlet detects email or phone automatically
3️⃣ Database matches credentials
4️⃣ Session created → redirected to Welcome page
5️⃣ Logout destroys session

 <img width="939" height="685" alt="image" src="https://github.com/user-attachments/assets/64cb9fdf-bf7e-49c9-a5d4-dbb6367cec37" />
 
🚀 Future Enhancements

Order cart system

Online payment integration

Admin dashboard for menu management

User profile & order history

Customer ratings & reviews

Invoice generation PDF

🤝 Contributing

Contributions are welcome!
To contribute:

Fork repo

Create feature branch

Commit changes

Open Pull Request

📬 Contact

Shadab Khan
💻 Java Developer | Web Developer
📧 Email: shadabkhanasr04@gmail.com
 


🔗 GitHub: https://github.com/shadab04

⭐ If you like this project, don’t forget to give it a star!
 
