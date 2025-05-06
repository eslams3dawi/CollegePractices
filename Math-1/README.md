# Math-1: Numerical Integration using Trapezoidal Rule

This folder contains a C++ program that performs **numerical integration** using the **Trapezoidal Rule**. It also calculates the **approximate error** between the computed integral and a more refined approximation.

## Features

- Accepts user input for:
  - Number of intervals (`n`)
  - Lower limit of integration (`a`)
  - Upper limit of integration (`b`)
- Approximates the definite integral of the function:  
  \[
  f(x) = \sqrt{1 + x^3}
  \]

## Code Breakdown

- `fn(x)` — Function to be integrated.
- `error(a, b, y)` — Estimates the error by comparing the result to a 1000-interval approximation.
- Main logic includes:
  - User input
  - Trapezoidal summation
  - Output of final result and estimated error

## Purpose

This program is part of a numerical methods course (Math-1), specifically focusing on integration techniques when an analytical solution is difficult or impossible to find.

```
