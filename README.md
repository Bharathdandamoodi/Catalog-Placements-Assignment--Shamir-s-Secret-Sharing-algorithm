**Catalog Placements Assignment - Shamir's Secret Sharing (Simplified)**

**gh repo clone Bharathdandamoodi/Catalog-Placements-Assignment--Shamir-s-Secret-Sharing-algorithm**

**Overview**

This project implements a simplified version of Shamir's Secret Sharing algorithm to reconstruct the constant term (c) of an unknown polynomial, given a set of encoded roots. Here's the polynomial representation:

```
f(x) = a_m x^m + a_{m-1} x^{m-1} + ... + a_1 x + c
```

where:

- `m` is the degree of the polynomial
- `a_m, a_{m-1}, ..., a_1, c` are real number coefficients (all positive integers)
- `a_m ≠ 0` (ensures the polynomial is of degree `m`)

Our primary objective is to find the constant term `c`.

**Problem Statement**

The assignment involves processing a JSON file containing the following information:

- **Keys:**
    - `n`: Total number of provided roots.
    - `k`: Minimum number of roots required to reconstruct the secret (c) - `k = m + 1`.
- **Roots (objects with keys 1, 2, ..., n):**
    - `base`: Base in which the root's value (`value`) is encoded.
    - `value`: Encoded value of the root in the specified `base`.

**Requirements**

1. **Read Input from JSON File:** Parse the JSON file containing the encoded roots and configuration parameters.
2. **Decode Y Values:** Convert the encoded values (`value`) for each root from their respective bases back to integers.
3. **Polynomial Reconstruction:** Employ a method like Lagrange interpolation or another suitable technique to determine the constant term `c` using the decoded root values.

**Setup and Usage**

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Bharathdandamoodi/Catalog-Placements-Assignment--Shamir-s-Secret-Sharing-algorithm
   ```

2. **Programming Environment:**
   - Use a language of your choice (except Python) for the implementation.
   - Ensure you have the necessary development tools (e.g., compiler, IDE) installed.

3. **Input JSON File:**
   - Prepare a JSON file adhering to the specified format (see "Input Format" section).
   - Place the JSON file within the project directory.

4. **Run the Program:**
   - Execute the main script or executable file using your chosen environment.

**Input Format**

The expected input JSON format is as follows:

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

**Example**

**Sample Input:**

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

**Sample Output:**

The program will output the reconstructed constant term `c` calculated from the provided roots.

**Constraints**

- All coefficients `a_m, a_{m-1}, ..., a_1, c` are positive integers within the range of a 256-bit number.
- The number of provided roots (`n`) is always greater than or equal to the minimum required roots (`k`).
