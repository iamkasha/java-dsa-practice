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
| [0011-container-with-most-water](https://github.com/iamkasha/java-dsa-practice/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/iamkasha/java-dsa-practice/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/iamkasha/java-dsa-practice/tree/master/0016-3sum-closest) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0075-sort-colors](https://github.com/iamkasha/java-dsa-practice/tree/master/0075-sort-colors) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/iamkasha/java-dsa-practice/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0088-merge-sorted-array) |
| [0125-valid-palindrome](https://github.com/iamkasha/java-dsa-practice/tree/master/0125-valid-palindrome) |
| [0283-move-zeroes](https://github.com/iamkasha/java-dsa-practice/tree/master/0283-move-zeroes) |
| [0344-reverse-string](https://github.com/iamkasha/java-dsa-practice/tree/master/0344-reverse-string) |
| [0392-is-subsequence](https://github.com/iamkasha/java-dsa-practice/tree/master/0392-is-subsequence) |
| [0844-backspace-string-compare](https://github.com/iamkasha/java-dsa-practice/tree/master/0844-backspace-string-compare) |
| [0977-squares-of-a-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0977-squares-of-a-sorted-array) |
## String
|  |
| ------- |
| [0125-valid-palindrome](https://github.com/iamkasha/java-dsa-practice/tree/master/0125-valid-palindrome) |
| [0344-reverse-string](https://github.com/iamkasha/java-dsa-practice/tree/master/0344-reverse-string) |
| [0392-is-subsequence](https://github.com/iamkasha/java-dsa-practice/tree/master/0392-is-subsequence) |
| [0844-backspace-string-compare](https://github.com/iamkasha/java-dsa-practice/tree/master/0844-backspace-string-compare) |
## Array
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/iamkasha/java-dsa-practice/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/iamkasha/java-dsa-practice/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/iamkasha/java-dsa-practice/tree/master/0016-3sum-closest) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0075-sort-colors](https://github.com/iamkasha/java-dsa-practice/tree/master/0075-sort-colors) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/iamkasha/java-dsa-practice/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0088-merge-sorted-array) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/iamkasha/java-dsa-practice/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0219-contains-duplicate-ii](https://github.com/iamkasha/java-dsa-practice/tree/master/0219-contains-duplicate-ii) |
| [0283-move-zeroes](https://github.com/iamkasha/java-dsa-practice/tree/master/0283-move-zeroes) |
| [0643-maximum-average-subarray-i](https://github.com/iamkasha/java-dsa-practice/tree/master/0643-maximum-average-subarray-i) |
| [0977-squares-of-a-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0977-squares-of-a-sorted-array) |
| [1984-minimum-difference-between-highest-and-lowest-of-k-scores](https://github.com/iamkasha/java-dsa-practice/tree/master/1984-minimum-difference-between-highest-and-lowest-of-k-scores) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/iamkasha/java-dsa-practice/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/iamkasha/java-dsa-practice/tree/master/0016-3sum-closest) |
| [0075-sort-colors](https://github.com/iamkasha/java-dsa-practice/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0088-merge-sorted-array) |
| [0977-squares-of-a-sorted-array](https://github.com/iamkasha/java-dsa-practice/tree/master/0977-squares-of-a-sorted-array) |
| [1984-minimum-difference-between-highest-and-lowest-of-k-scores](https://github.com/iamkasha/java-dsa-practice/tree/master/1984-minimum-difference-between-highest-and-lowest-of-k-scores) |
## Dynamic Programming
|  |
| ------- |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/iamkasha/java-dsa-practice/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0392-is-subsequence](https://github.com/iamkasha/java-dsa-practice/tree/master/0392-is-subsequence) |
## Stack
|  |
| ------- |
| [0844-backspace-string-compare](https://github.com/iamkasha/java-dsa-practice/tree/master/0844-backspace-string-compare) |
## Simulation
|  |
| ------- |
| [0844-backspace-string-compare](https://github.com/iamkasha/java-dsa-practice/tree/master/0844-backspace-string-compare) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/iamkasha/java-dsa-practice/tree/master/0011-container-with-most-water) |
## Sliding Window
|  |
| ------- |
| [0219-contains-duplicate-ii](https://github.com/iamkasha/java-dsa-practice/tree/master/0219-contains-duplicate-ii) |
| [0643-maximum-average-subarray-i](https://github.com/iamkasha/java-dsa-practice/tree/master/0643-maximum-average-subarray-i) |
| [1984-minimum-difference-between-highest-and-lowest-of-k-scores](https://github.com/iamkasha/java-dsa-practice/tree/master/1984-minimum-difference-between-highest-and-lowest-of-k-scores) |
## Hash Table
|  |
| ------- |
| [0219-contains-duplicate-ii](https://github.com/iamkasha/java-dsa-practice/tree/master/0219-contains-duplicate-ii) |
<!---LeetCode Topics End-->