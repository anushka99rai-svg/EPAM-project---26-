# EPAM Systems Coding Solutions

This repository contains Java implementations for graph theory and algorithm problems.

---

## 📌 Problem Descriptions & Solutions

### 1. Tree of Trusted Servers (`problem_1.java`)

#### **Problem Overview**
A communication network is structured as a tree rooted at **Server 1** (Central Authentication Server). Each node/server holds an integer security key. A server is considered **trusted** if the cumulative XOR value of all security keys along the simple path from the root server to that server is greater than or equal to a given threshold $K$.

#### **Approach**
- **Data Structure:** Adjacency List for tree representation.
- **Algorithm:** Depth First Search (DFS).
- **Complexity:** 
  - **Time Complexity:** $O(N)$ — traverses each node and edge in the tree exactly once.
  - **Space Complexity:** $O(N)$ — for adjacency list storage and recursion call stack depth.

---

### 2. Emergency Route Validation (`problem_2.java`)

#### **Problem Overview**
A national highway system is modeled as an unweighted, connected, undirected graph. Emergency rescue teams travel from the capital city (**City 1**) to other destinations. A city is deemed **efficiently reachable** if its shortest path length from City 1 requires at most $D$ road connections.

#### **Approach**
- **Data Structure:** Adjacency List and Queue (`LinkedList`).
- **Algorithm:** Breadth First Search (BFS) for shortest path evaluation in unweighted graphs.
- **Complexity:** 
  - **Time Complexity:** $O(N + M)$ — explores reachable nodes and edges up to distance $D$.
  - **Space Complexity:** $O(N)$ — for distance tracking array and BFS queue storage.

---

## 🛠️ How to Run Locally

### Prerequisites
- Java Development Kit (JDK 8 or higher)
- Terminal / VS Code

### Execution Steps

1. **Compile the program:**
2. Run the compiled class:
   java problem_1
3. Provide sample inputs directly via terminal standard input (stdin).
   ```bash
   javac problem_1.java
