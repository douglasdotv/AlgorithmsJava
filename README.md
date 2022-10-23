# Algorithms

## selectionSort
Selection sort is a sorting algorithm, specifically an in-place comparison sort. It has O(n2) time complexity, making it inefficient on large lists, and generally performs worse than the similar insertion sort. Selection sort is noted for its simplicity, and it has performance advantages over more complicated algorithms in certain situations, particularly where auxiliary memory is limited.

The algorithm divides the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.

## insertionSort
Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.

## bubbleSort
Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the list. Although the algorithm is simple, it is too slow and impractical for most problems even when compared to insertion sort. Bubble sort can be practical if the input is in mostly sorted order with some out-of-order elements nearly in position.

## mergeSort
Merge sort is an efficient, general-purpose, comparison-based sorting algorithm. Most implementations produce a stable sort, which means that the implementation preserves the input order of equal elements in the sorted output. Merge sort is a divide and conquer algorithm. Conceptually, a merge sort works as follows:
Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.

## quickSort
Quicksort (sometimes called partition-exchange sort) is an efficient sorting algorithm, serving as a systematic method for placing the elements of an array in order. When implemented well, it can be about two or three times faster than its main competitors, merge sort and heapsort.

Quicksort is a comparison sort, meaning that it can sort items of any type for which a "less-than" relation (formally, a total order) is defined. In efficient implementations it is not a stable sort, meaning that the relative order of equal sort items is not preserved. Quicksort can operate in-place on an array, requiring small additional amounts of memory to perform the sorting. It is very similar to selection sort, except that it does not always choose worst-case partition.

## Binary Search
Binary search, also known as half-interval search, logarithmic search, or binary chop, is a search algorithm that finds the position of a target value within a sorted array. Binary search compares the target value to the middle element of the array; if they are unequal, the half in which the target cannot lie is eliminated and the search continues on the remaining half until it is successful. If the search ends with the remaining half being empty, the target is not in the array.

## Two Balls
"I'm in a 100 storey building. I have with me two glass balls. I know that, if I throw the ball out of the window, it will not break if the floor number is less than X, and it will always breaks if the floor number is equal to or greater than X. Assuming that I can reuse a ball that doesn't break, find X in the minimum number of throws."

## Time complexities:

Algorithm | Best case | Average case | Worst case
--- | --- | --- | ---
Bubble Sort | O(n) | O(n^2) | O(n^2)
Merge Sort | O(nlog(n)) | O(nlog(n)) | O(nlog(n))
Quick Sort | O(nlog(n)) | O(nlog(n)) | O(n^2)
Selection Sort | O(n^2) | O(n^2) | O(n^2)
Insertion Sort | O(n) | O(n^2) | O(n^2)
Linear Search | O(1) | O(n) | O(n)
Binary Search | O(1) | O(log(n)) | O(log(n))
Two Balls | | | O(sqrt(n))

## Space complexities:

Algorithm | Space complexity (worst)
--- | ---
Bubble Sort | O(1)
Merge Sort | O(n)
Quick Sort | O(1)
Selection Sort | O(1)
Insertion Sort | O(1)
Linear Search | O(1)
Binary Search | O(1)

---

# DataStructures
- Arrays
- LinkedLists
- Stacks
- Queues
- Sets
- …

(README under construction.)