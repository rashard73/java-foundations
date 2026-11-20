# Student Grade Tracker

A Java console application for recording student grades, validating user input, and calculating grade averages.

## Features

- Enter student names and grades
- Validate numeric grade inputs from 0 to 100
- Reject empty student names
- Calculate average grades
- Handle empty and null grade arrays safely
- Display student grade reports
- Automated unit tests using JUnit 5

## Technologies

- Java
- JUnit 5
- IntelliJ IDEA
- Git and GitHub

## Project Structure

```text
java-foundations/
├── src/
│   ├── Main.java
│   └── Student.java
├── test/
│   └── StudentTest.java
└── README.md
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Ensure a Java JDK is configured.
4. Run `Main.java`.
5. Follow the console prompts.

## Testing

The project includes JUnit 5 tests covering:

- Normal grade averages
- Empty arrays
- Single grades
- Decimal grades
- Boundary values
- Null grades
- Uninitialized student grades
- Invalid names and grades
- Defensive copying

Run `StudentTest.java` through IntelliJ's JUnit runner.

## Engineering Concepts Practiced

- Object-oriented programming
- Encapsulation
- Arrays and loops
- Input validation
- Exception handling
- Unit testing
- Boundary-value testing
- Null safety
- Debugging and regression testing

## Future Improvements

- Support multiple students
- Save records to a file
- Load existing records
- Search for students
- Calculate letter grades

## Author

Rashard Isaac

Computer Science Student | Aspiring Software & Embedded Systems Engineer