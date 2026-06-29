# 🍽 Restaurant Ordering System (Java OOP)

A simple Java console application that simulates a restaurant ordering system using Object-Oriented Programming (OOP) principles.

The application allows users to place food orders, calculate discounts, validate menu selections, and generate purchase receipts through a modular project structure.

---

## 📸 Preview

> Screenshot coming soon.

---

## ✨ Features

- 🍛 Display food and beverage menu
- 🛒 Process customer orders
- 🔢 Calculate subtotal, discount, and final payment
- ⚠️ Validate user input using custom exceptions
- 🧾 Generate formatted purchase receipts
- 📦 Organized project structure using Java packages
- 🧩 Apply Object-Oriented Programming concepts

---

## 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Object-Oriented Programming (OOP) | Software Design |
| CLI (Console) | User Interface |

---

## 📂 Project Structure

```text
restaurant-ordering-system/
│
├── src/
│   ├── menu/
│   │   ├── MenuItem.java
│   │   ├── MenuService.java
│   │   └── MenuItemNotFoundException.java
│   │
│   ├── order/
│   │   ├── Order.java
│   │   └── OrderItem.java
│   │
│   ├── struk/
│   │   └── ReceiptGenerator.java
│   │
│   └── Main.java
│
└── README.md
```

---

## 🧠 OOP Concepts Implemented

### 🔒 Encapsulation

All class attributes are declared as `private` and accessed using getters and setters.

### 📦 Class & Object

The application is divided into multiple classes to separate responsibilities:

- `MenuItem`
- `MenuService`
- `Order`
- `OrderItem`
- `ReceiptGenerator`

### ⚠️ Exception Handling

A custom exception (`MenuItemNotFoundException`) is implemented to handle invalid menu selections.

### 📁 Package Organization

The project is organized into packages based on functionality:

- `menu`
- `order`
- `struk`

This modular structure improves readability and maintainability.

---

## 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/Plida05/<repository-name>.git
```

### Compile

```bash
javac Main.java
```

### Run

```bash
java Main
```

---

## 🧾 Sample Output

```text
============= PURCHASE RECEIPT =============

Nasi Goreng       x1   = 18000
Es Teh            x2   = 10000

--------------------------------------------
Subtotal                : 28000
Discount (10%)          : -2800
Total                   : 25200

============================================
```

---

## 🎯 Learning Objectives

This project was developed to practice:

- Object-Oriented Programming (OOP)
- Package Organization
- Exception Handling
- Modular Application Design
- Java Console Application Development

---

## 👩‍💻 Author

**Rr Nabila Fatharani Yuwvrida**

Information Systems Student
