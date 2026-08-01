Markdown
# 🏦 XYZ Bank - Customer Coupon Generator

A light, responsive web application designed for bank customers to verify their Customer ID and generate unique promotion coupon codes seamlessly.

---

## 🚀 Features

* **Interactive Guidelines:** Clean, easy-to-read rules section outlining eligibility and security guidelines.
* **Instant ID Verification:** Client-side validation ensuring customer IDs meet the bank's format requirements (must contain `XYZ`).
* **Dynamic UI Toggling:** Clean UI transitions that hide initial instructions and display the registration form upon clicking **Register Now**.
* **Coupon Generation:** Generates and displays a unique coupon code on screen upon successful validation without reloading or wiping the DOM.

---

## 🛠️ Tech Stack

* **HTML5:** Semantic structure for the registration layout and guidelines.
* **CSS3:** Custom styles for layout presentation and state visibility.
* **JavaScript (ES6):** DOM manipulation, event handling, and ID validation logic.

---

## 📂 Project Structure

```text
├── main.html      # Main HTML layout containing rules and form inputs
├── style.css      # Application styling and layout rules
└── app.js         # Interactive DOM logic and validation functions
⚙️ How to Run Locally
Clone the repository:

Bash
git clone [https://github.com/anushka99rai-svg/EPAM-project---26-.git](https://github.com/anushka99rai-svg/EPAM-project---26-.git)
Navigate to the project folder:

Bash
cd EPAM-project---26-
Open in browser:
Simply double-click main.html or open it using VS Code's Live Server extension.

📝 Rules & Validation Criteria
Customer ID Format: Must contain XYZ to pass verification.

Security Notice: The bank will never request sensitive banking credentials like PINs, passwords, or CVVs.