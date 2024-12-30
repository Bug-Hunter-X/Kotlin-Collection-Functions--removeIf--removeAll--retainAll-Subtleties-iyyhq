# Kotlin Collection Function Gotchas: removeIf, removeAll, and retainAll

This repository demonstrates a common source of confusion when using Kotlin's `removeIf`, `removeAll`, and `retainAll` functions with mutable lists.  These functions, while powerful, can lead to unexpected results if their behavior isn't fully understood.  The example highlights the subtle differences between them and provides a clear explanation to avoid common pitfalls.

## The Problem

The core issue lies in the nuanced way these functions modify the original list.  `removeIf` removes elements based on a predicate, while `removeAll` removes all elements that are contained in a given collection. `retainAll` keeps only elements that match a given predicate.

## Solution

The solution focuses on carefully selecting the appropriate function based on the desired outcome and understanding the predicate's role in determining which elements are removed or retained. The example code shows how to correctly use each function to achieve the intended result.

## How to Run

1. Clone this repository.
2. Open the project in your preferred Kotlin IDE.
3. Run the `main` function in `bug.kt` and `bugSolution.kt` to observe the differences.