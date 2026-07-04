# Logistics Package Tracking System

A Java-based Logistics Package Tracking System developed using Object-Oriented Programming (OOP) principles. The system allows customers to register, book parcels, track shipments using a unique tracking ID, and enables logistics representatives to update parcel status and current location.

---

## Overview

This project simulates a simple logistics package tracking system where customers can register, book parcels, and monitor shipment progress. Every booked parcel is assigned a unique tracking ID which is used to retrieve shipment details.

The application demonstrates the practical implementation of Object-Oriented Programming concepts such as classes, objects, encapsulation, and modular design.

---

## Features

- Customer Registration and Login
- Parcel Booking
- Automatic Tracking ID Generation
- Parcel Status Update
- Parcel Location Update
- Parcel Tracking using Tracking ID
- Console-based User Interface

---

## System Workflow

1. Customer registers an account.
2. Customer logs into the system.
3. Customer books a parcel by entering sender and receiver details.
4. System generates a unique tracking ID.
5. Logistics representative updates parcel status and location.
6. Customer tracks the parcel using the tracking ID.

---

## Modules

### Register

Handles customer registration and login authentication.

### Customer Booking

Allows customers to book parcels by entering sender name, receiver name, and delivery address.

### Parcel

Stores parcel information including:

- Tracking ID
- Sender Name
- Receiver Name
- Delivery Address
- Current Location
- Delivery Status

### Representative Update

Allows logistics representatives to update:

- Delivery Status
- Current Parcel Location

### Customer Tracking

Displays parcel information after verifying the tracking ID.

### Main System

Provides the main menu and controls the workflow between all modules.

---

## Technologies Used

- Java
- Object-Oriented Programming
- Scanner Class
- Random Number Generation
- Console-based Interface

---

## OOP Concepts Implemented

- Classes and Objects
- Encapsulation
- Method Invocation
- Object Communication
- Modular Programming

---

## Repository Structure

```text
logistics-package-tracking-system/
│
├── CustomerBooking.java
├── CustomerTracking.java
├── MainSystem.java
├── Parcel.java
├── Register.java
├── RepresentativeUpdate.java
├── README.md
└── Logistics_Package_Tracking_System_Report.pdf
```

---

## Sample Execution

```
1. Register
2. Login
3. Book Parcel

Tracking ID : BOB4582

Representative updates:

Status : In Transit
Location : Chennai Hub

Customer Tracking:

Tracking ID : BOB4582

Sender : Rahul
Receiver : Arun
Status : In Transit
Location : Chennai Hub
```

---

## Applications

- Courier Services
- Logistics Companies
- Supply Chain Management
- Parcel Tracking
- Delivery Management

---

## Future Improvements

- Database Integration (MySQL)
- Graphical User Interface (JavaFX/Swing)
- Email and SMS Notifications
- Multiple Parcel Management
- Admin Dashboard
- Delivery Route Optimization
- Real-Time GPS Tracking

---

## References

1. Oracle Java Documentation
2. Object-Oriented Programming Concepts
3. Java Scanner Class Documentation

---

## Author

**Revanth S**

B.Tech Artificial Intelligence & Data Science

Amrita Vishwa Vidyapeetham

---

⭐ If you found this project useful, consider giving it a star.
