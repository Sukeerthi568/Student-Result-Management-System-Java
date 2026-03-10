# Student Result Management System

A simple **Student Result Management System** built using **Java and MySQL**.  
This project allows users to store student information, enter subject marks, calculate GPA, and generate result reports.

---

## Features

- Add student details
- Store marks for multiple subjects
- Calculate total marks and GPA
- Generate student result reports
- Store and retrieve data using MySQL database

---

## Technologies Used

- Java
- MySQL

---

## Project Structure

Student-Result-Management-System
│
├── DBConnection.java
├── Student.java
├── ResultDAO.java
├── Main.java
└── database.sql

---

## Database Setup

Run the following SQL commands in MySQL:

```sql
CREATE DATABASE result_system;

USE result_system;

CREATE TABLE students(
id INT PRIMARY KEY,
name VARCHAR(50)
);

CREATE TABLE marks(
student_id INT,
subject1 INT,
subject2 INT,
subject3 INT,
FOREIGN KEY (student_id) REFERENCES students(id)
);
