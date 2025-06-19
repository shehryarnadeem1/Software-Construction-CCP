# Question 2 – Refactored ReservationForm

## 📌 Objective

Refactor the `confirmReservationButtonActionPerformed` method to remove code smells and improve the internal structure without changing the external behavior.

---

## 🔍 Code Smell Identified

- **Long Method**
- **Multiple Responsibilities**
- **Repeated Code (Setting feedback and requesting focus)**

---

## 🛠 Refactoring Technique: Extract Method

### ✅ Why?
This technique breaks a long method into smaller, purpose-specific methods. It:
- Enhances readability
- Improves maintainability
- Follows the Single Responsibility Principle (SRP)

---

## ✅ Refactored Features

- Separated validation checks:
  - `areDatesValid()`
  - `isNameValid()`
  - `isAddressValid()`
  - `isCreditCardValid()`
- Clean UI feedback and handling
- All logic encapsulated cleanly

---

## 💻 How to Run

1. Open project folder in VS Code
2. Run this file in a Java environment (with `javac` + `java` or your IDE)
3. Ensure supporting dummy classes (`TextField`, `TextArea`, etc.) are included

---

## 👨‍💻 Author

**Shehryar Nadeem**  
GitHub: [shehryarnadeem1](https://github.com/shehryarnadeem1)

---

## 🗂️ Folder Structure