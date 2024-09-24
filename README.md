## [Please Click here for my Exercise 2 Solution  ](https://github.com/Manya72/Ei-assignment_Q2)
## Design Patterns in Java
This project demonstrates the implementation of six design patterns in Java across three categories: Behavioral, Creational, and Structural. It showcases common programming solutions that promote flexibility, reuse, and maintainability.

## Patterns Implemented

## Behavioral Patterns
- 1.Memento Pattern: Enables saving and restoring an object's state without exposing its internal structure, using the TextEditor example to implement undo functionality.
- 2.Observer Pattern: Establishes a one-to-many dependency between objects, with the WeatherStation example notifying MobileDisplay observers of state changes.

## Creational Patterns
- 3.Factory Pattern: Provides an interface for creating objects while allowing subclasses to determine the specific types to instantiate, demonstrated through BankAccountFactory creating BusinessAccount and PersonalAccount.
- 4.Singleton Pattern: Ensures a class has only one instance and provides global access, illustrated by the DatabaseConnection managing a single connection instance.

## Structural Patterns
- 5.Decorator Pattern: Allows adding new functionalities to individual objects dynamically without altering their structure, shown through CloudStorageService enhancing BasicCloudStorage with compression features.
- 6.Proxy Pattern: Acts as a surrogate for another object to control access, exemplified by PaymentProxy managing access to the RealPayment class for operations like logging and validation.

To get started with this project, clone the repository and import it into your favorite Java IDE .

## Project Structure:

- Educational_Initiatives_q1/
- behavioral/
  - MementoPattern/
    - Caretaker.java
    - TextEditor.java
    - MementoPatternExample.java
    - Memento.java
  - ObserverPattern/
    - MobileDisplay.java
    - Observer.java
    - ObserverPatternDemo.java
    - WeatherStation.java
- creational/
    - FactoryPattern/
      - BankAccount.java
      - BankAccountFactory.java
      - BankSystem.java
      - BusinessAccount.java
      - PersonalAccount.java
   - Singleton/
      - DatabaseConnection.java
      - SingletonPatternExample.java
- structural/
  - DecoratorPattern/
     - BasicCloudStorage.java
     - CloudStorage.java
     - Compression.java
     - CloudStorageService.java
     - StorageDecorator.java
  - ProxyPattern/
     - Client.java
     - Payment.java
     - PaymentProxy.java
     - RealPayment.java

## Prerequisites
Java Development Kit (JDK) 8 or later.

