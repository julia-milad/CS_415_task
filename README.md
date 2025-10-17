# 🧮 Java Calculator – GitHub Actions Practice

This repository contains a simple **Java Calculator project** built using **Maven**.
It is mainly created to **practice GitHub Actions** and learn how to use **YML workflows** for Continuous Integration (CI).

The workflow automatically **builds the project** and **runs unit tests** whenever a **push** or **pull request** is made to the `any` branch — helping ensure that new code does not break existing functionality.

---

## ⚙️ GitHub Actions Workflow

The workflow file is located at:

```
.github/workflows//github-actions-demo.yml
```
---

## 🚀 How It Works

1. When you **push code** or open a **pull request**, GitHub Actions automatically:

   * Checks out your code.
   * Sets up **Java 17** and **Maven**.
   * Builds the project.
   * Runs all **JUnit tests**.

2. If all tests pass ✅ — the workflow succeeds.
   If any test fails ❌ — the workflow fails, preventing broken code from merging.

---


## 👩‍💻 Author

**Julia Milad**

> A simple Java calculator project created to practice **GitHub Actions**, **Maven**, and **YML-based workflows** for Continuous Integration.

---
