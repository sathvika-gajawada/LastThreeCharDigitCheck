This Java program determines whether the **last three characters** of a given string contain at least one numeric digit (0-9). If the input string is shorter than three characters, it checks the entire string.

The program handles edge cases such as `null`, empty strings, and strings with leading or trailing whitespace by trimming the input before evaluation.

Example Usage:

"Test8RE" → true (digit 8 in last three characters)

"abc1" → true (digit 1 in last three characters)

"xyz" → false (no digit)

---

## Features

- Checks for digits within the last three characters of a string.
- Safely handles `null` and empty input values.
- Trims whitespace before processing.
- Includes comprehensive test cases demonstrating expected behavior.

---

## Getting Started

Make sure you have Java Development Kit (JDK) 8 or above installed. Save your Java source code as `LastThreeCharactersCheckForDigit.java`. Then open a terminal or command prompt, navigate to the directory containing the Java file, compile it by running:

```bat
javac LastThreeCharactersCheckForDigit.java

java LastThreeCharactersCheckForDigit
