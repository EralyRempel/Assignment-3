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
The following table shows execution times measured in nanoseconds (ns) based on the program output.

| Dataset Size | Selection Sort (Basic) | Quick Sort (Advanced) | Binary Search |
| :--- | :--- | :--- | :--- |
| **10 (Small)** | 10,500 ns | 21,100 ns | 4,600 ns |
| **100 (Medium)** | 177,500 ns | 43,700 ns | 1,200 ns |
| **1000 (Large)** | 5,323,300 ns | 596,700 ns | 1,300 ns |

## Performance Analysis
* **Which algorithm was faster?** On the smallest dataset ($n=10$), Selection Sort showed a faster execution time. However, as the dataset size increased to $n=100$ and $n=1000$, Quick Sort significantly outperformed Selection Sort. This aligns with the theory that $O(n \log n)$ scales much more efficiently than $O(n^2)$.
* **Input Size Impact:** The performance gap widened drastically with larger inputs. While Selection Sort's time increased by more than 50 times when moving from 100 to 1000 elements, Quick Sort's time increased much more gradually.
* **Binary Search Efficiency:** Binary Search demonstrated consistent efficiency across all sizes, proving that $O(\log n)$ complexity is ideal for large-scale searching, provided the data is pre-sorted.

## Reflection
This assignment provided practical insight into algorithm efficiency. It was interesting to observe that for very small arrays, the overhead of recursion in Quick Sort makes it slower than a simple Selection Sort. However, for any practical application involving larger data, the choice of an advanced algorithm is essential. The implementation also reinforced the importance of proper data preparation, such as sorting before a binary search.
