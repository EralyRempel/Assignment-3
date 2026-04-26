# Assignment-3
# Algorithm Sorting and Searching Analysis System

## Project Overview
This project implements and analyzes three fundamental algorithms: **Selection Sort**, **Quick Sort**, and **Binary Search**. The goal is to measure their performance across different dataset sizes and compare theoretical Big-O complexity with practical execution time.

## Algorithm Descriptions
* **Selection Sort (Basic Sorting):** A simple comparison-based algorithm that repeatedly finds the minimum element and moves it to the beginning. 
  * **Time Complexity:** $O(n^2)$
* **Quick Sort (Advanced Sorting):** A divide-and-conquer algorithm that picks a 'pivot' and partitions the array around it. 
  * **Time Complexity:** $O(n \log n)$ on average
* **Binary Search (Searching):** An efficient search algorithm that finds the position of a target value within a sorted array by repeatedly dividing the search interval in half. 
  * **Time Complexity:** $O(\log n)$

## Experimental Results
The following table shows execution times measured in nanoseconds (ns) from the experiment.

| Dataset Size | Selection Sort (Basic) | Quick Sort (Advanced) | Binary Search |
| :--- | :--- | :--- | :--- |
| **10 (Small)** | 10,500 ns | 21,100 ns | 4,600 ns |
| **100 (Medium)** | 177,500 ns | 43,700 ns | 1,200 ns |
| **1000 (Large)** | 5,323,300 ns | 596,700 ns | 1,300 ns |

## Performance Analysis
* **Which algorithm was faster?** On small datasets ($n=10$), Selection Sort was faster. However, for $n=100$ and $n=1000$, Quick Sort significantly outperformed Selection Sort because $O(n \log n)$ scales much better than $O(n^2)$.
* **Input Size Impact:** As the size increased, Selection Sort's time grew dramatically (quadratically), while Quick Sort's growth was more controlled, matching Big-O expectations.
* **Binary Search Efficiency:** Binary Search remained extremely fast regardless of size, showing why $O(\log n)$ is superior for searching in sorted data. It requires a sorted array to divide the search space correctly.

## Screenshots
![Console Output](docs/screenshots/image_8aacd6.png)

## Reflection
This assignment demonstrated the gap between theoretical complexity and practical performance. I learned that while Selection Sort is easier to implement, it becomes inefficient for large datasets. The primary challenge was ensuring the array was correctly sorted before performing the Binary Search. Implementation of the partition logic in Quick Sort also required careful attention to index handling.
