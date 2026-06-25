# Java DSA Practice

A collection of Data Structures and Algorithms problems solved in Java, organized by topic. Each file is self-contained with a `main` method you can run directly.

## Tech Stack

- Java 17
- No build tool required — plain Java files, runnable from IntelliJ or the command line

## Project Structure

```
src/
├── arrays/          # Array manipulation and search problems
├── binarysearch/    # Binary search and search space problems
├── datastructures/  # Data structure usage examples
├── graphs/          # BFS, DFS, and graph traversal problems
├── linkedlist/      # Singly linked list problems
├── mathematics/     # Number theory and math problems
├── recursion/       # Recursion and backtracking problems
├── sorting/         # Sorting algorithm implementations
├── stack/           # Stack-based problems
├── strings/         # String manipulation problems
└── trees/           # Binary tree traversal and search problems
```

## How to Run

Each file has a `main` method. Run directly from IntelliJ, or from the command line:

```bash
# Compile a single file along with its package dependencies
javac -d out src/linkedlist/ListNode.java src/linkedlist/ReverseLinkedList.java
java -cp out linkedlist.ReverseLinkedList

# Or compile an entire topic folder at once
javac -d out src/trees/*.java
java -cp out trees.LevelOrderTraversal
```

## Future Improvements

- Add dynamic programming problems
- Add JUnit tests for each solution
- Add time and space complexity notes to remaining files

<!---LeetCode Topics Start-->
# LeetCode Topics
## Two Pointers
|  |
| ------- |
| [0344-reverse-string](https://github.com/iamkasha/java-dsa-practice/tree/master/0344-reverse-string) |
| [0977-squares-of-a-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0977-squares-of-a-sorted-array) |
## String
|  |
| ------- |
| [0344-reverse-string](https://github.com/iamkasha/java-dsa-practice/tree/master/0344-reverse-string) |
## Array
|  |
| ------- |
| [0977-squares-of-a-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0977-squares-of-a-sorted-array) |
## Sorting
|  |
| ------- |
| [0977-squares-of-a-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0977-squares-of-a-sorted-array) |
<!---LeetCode Topics End-->