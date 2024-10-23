```markdown
# Shamir's Secret Sharing - Simplified Polynomial Reconstruction

## Overview

This project implements a simplified version of Shamir's Secret Sharing algorithm to reconstruct a polynomial's constant term from given roots. The polynomial can be represented in the form:

\[ f(x) = a_m x^m + a_{m-1} x^{m-1} + ... + a_1 x + c \]

where \( m \) is the degree of the polynomial, and the constant term \( c \) is our primary focus.

## Problem Statement

The assignment involves reading polynomial roots from a JSON file, decoding the values encoded in different bases, and using these decoded values to calculate the constant term \( c \) of the polynomial.

### Key Details:
- Each root is provided in a JSON format with two main attributes:
  - `base`: The base in which the `value` is encoded.
  - `value`: The encoded value of the root in the specified base.
- The number of roots (n) and the minimum required roots (k) are also provided, where \( k = m + 1 \).

### Requirements:
- You must decode the Y values from their respective bases.
- Utilize a method such as Lagrange interpolation or another polynomial solving technique to determine the constant term \( c \).

## Setup and Usage

1. **Clone the Repository**
   ```bash
   gh repo clone Bharathdandamoodi/Catalog-Placements-Assignment--Shamir-s-Secret-Sharing-algorithm
   ```

2. **Install Dependencies**
   Ensure you have the required programming environment set up. For example, if you're using Java, make sure you have JDK installed.

3. **Run the Program**
   Modify the JSON input file as needed and run the program using your preferred IDE or environment. Ensure that the JSON file is correctly formatted as shown in the problem statement.

4. **Input Format**
   The input JSON should be structured as follows:
   ```json
   {
     "keys": {
       "n": 4,
       "k": 3
     },
     "1": {
       "base": "10",
       "value": "4"
     },
     ...
   }
   ```

## Example

### Sample Input
```json
{
  "keys": {
    "n": 4,
    "k": 3
  },
  "1": {
    "base": "10",
    "value": "4"
  },
  "2": {
    "base": "2",
    "value": "111"
  },
  "3": {
    "base": "10",
    "value": "12"
  },
  "6": {
    "base": "4",
    "value": "213"
  }
}
```

### Sample Output
The program will output the secret constant term \( c \) calculated from the provided roots.

## Constraints
- Coefficients are positive integers within the range of a 256-bit number.
- \( n \) (the number of roots) is always greater than or equal to \( k \).



## Acknowledgments
- [Shamir's Secret Sharing](https://en.wikipedia.org/wiki/Shamir%27s_Secret_Sharing) for the foundational concept.
```

Feel free to replace placeholders such as `yourusername` and `your-repo-name` with your actual GitHub username and repository name. This README provides a clear structure for anyone who visits your repository, detailing what the project is about, how to set it up, and what they can expect from the output.
