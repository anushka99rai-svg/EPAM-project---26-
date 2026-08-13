# Competitive Programming Problems: Greedy & Dynamic Programming

This repository contains simple and clean Java solutions for standard algorithmic problems based on **Greedy Algorithms** and **Dynamic Programming (DP)**.

---

## Problem 1: Scholarship Distribution (Greedy)

### Problem Description
A college has received a limited number of scholarships for students who participated in a coding competition. Every student has a minimum scholarship amount they are willing to accept. The college wants to award scholarships to as many students as possible without exceeding the available budget.

Each student can receive at most one scholarship, and the college can decide the order in which scholarships are awarded. The task is to determine the maximum number of students who can receive scholarships while staying within the total budget.

### Input Format
* **First line:** `N B` (number of students and total budget)
* **Second line:** `N` integers representing the minimum scholarship required by each student.

### Output Format
* Print the maximum number of students who can receive scholarships.

### Constraints
* $1 \le N \le 100,000$
* $1 \le B \le 10^9$
* $1 \le \text{Scholarship} \le 10^6$

### Example

**Input:**
```text
5 20
4 8 2 6 5
Output:Plaintext4
Explanation:Sort the scholarship requirements in increasing order [2, 4, 5, 6, 8].Award scholarships starting from the smallest requirement: $2 + 4 + 5 + 6 = 17 \le 20$. Adding $8$ exceeds budget $20$. Thus, a maximum of 4 students can receive scholarships.


Problem 2: Maximum Learning Points (Dynamic Programming)
Problem Description:-A student is preparing for a programming contest. Every day, the student can solve one topic, and each topic provides a certain number of learning points. However, the student cannot solve two consecutive difficult topics because of fatigue. Given the learning points of each topic arranged in order, determine the maximum learning points the student can earn without selecting two consecutive topics. Input Format First line: N (number of topics)Second line: N integers representing learning points. Output Format Print the maximum learning points.Constraints$1 \le N \le 100,000$$1 \le \text{Points} \le 10,000$ExampleInput:Plaintext6
5 1 2 10 6 2
Output:Plaintext17
Explanation:Choose topics with points 5, 10, and 2 (indices 0, 3, 5). The total learning points are $5 + 10 + 2 = 17$, which is the maximum possible without selecting two adjacent elements.
