## 📄Description - Exercise Statement

This is the first task for **Sprint 1. Java Language** in the **Backen Java Course** in ITAcademy (Barcelona, Spain).
There are 3 levels with exercises.

### Level 1 - Exercise 1

In a music group, there are different types of musical instruments. There are wind, string, and percussion instruments.

All instruments have attributes such as their name and price. Additionally, they have a method called `play()`. This method is abstract in the instrument class and must therefore be implemented in the child classes. If a wind instrument is being played, the method should display in the console: "A wind instrument is sounding"; if a string instrument is being played: "A string instrument is sounding"; and if a percussion instrument is being played: "A percussion instrument is sounding".

The loading process of a class only occurs once. Demonstrate that the loading can be triggered by creating the first instance of that class or by accessing a static member of it.

Research information about initialization blocks and static blocks in Java.

### Level 1 - Exercise 2

Create a class "Car" with the attributes: brand, model, and power. The brand must be static final, the model static, and the power final. Demonstrate the difference among the three. Is there any that can be initialized in the class constructor?

Add two methods to the "Car" class. A static method called `brake()` and a non-static method called `accelerate()`. The `accelerate` method should display in the console: "The vehicle is accelerating," and the `brake()` method should display: "The vehicle is braking."

Demonstrate how to invoke the static and non-static methods from the `main()` of the main class.

### Level 2 - Exercise 1

Create a class named "Phone" with the attributes brand and model, and the method `call()`. This method should receive a String with a phone number. The method should display a message in the console saying that it is calling the number received as a parameter.

Create an interface named "Camera" with the method `takePicture()`, and another interface named "Clock" with the method `alarm()`.

Create a class named "Smartphone" that is a subclass of "Phone" and simultaneously implements the "Camera" and "Clock" interfaces.

The `takePicture()` method should display in the console: "A photo is being taken," and the `alarm()` method should show: "The alarm is sounding."

From the `main()` of the application, create a `Smartphone` object and call the previous methods.

### Level 3 - Exercise 1

In a sports news editorial, news is classified by sports: football, basketball, tennis, F1, and motorcycling.

The editorial can have more than one editor, and we want to know their name, ID number, and salary. Once an ID number is assigned, it cannot be changed. All editors have the same salary, and if in the future the company can increase it, it will do so for everyone equally. Currently, the salary is €1500.

Each editor can work on more than one news item. News must have a headline, a text, a score, and a price. When created, the text must be empty.

Additionally, for football news, the competition it refers to (String), the club (String), and the player (String) must be specified.

For basketball news, the competition it refers to (String) and the club (String) must be indicated.

For tennis news, the competition (String) and the tennis players (String) should be specified.

For F1 news, the team (String) they refer to must be known.

For motorcycling news, the team (String) must be indicated.

News is sold to different media outlets. To know the price of each news item, we must implement a method called `calculateNewsPrice()`.

Below is an explanation of how to calculate the price of each news item:

- Football news:
    -   Initial price: €300
    -   Champions League: €100
    -   Barça or Madrid: €100
    -   Ferran Torres or Benzema: €50

> Example: A news item about a goal scored by Ferran Torres from Barça in the Champions League has a price of €550.

- Basketball news:
    -   Initial price: €250
    -   Euroleague: €75
    -   Barça or Madrid: €75

- Tennis news:
    -   Initial price: €150
    -   Federer, Nadal, or Djokovic: €100

- F1 news:
    -   Initial price: €100
    -   Ferrari or Mercedes: €50

- Motorcycle news:
    -   Initial price: €100
    -   Honda or Yamaha: €50

To calculate the scores of the news items, the following criteria are followed:

- Football news:
    -   5 Points.
    -   Champions League: 3 points
    -   League: 2 points
    -   Barça or Madrid: 1 point
    -   Ferran Torres or Benzema: 50€

> Example: A news item about a goal scored by Ferran Torres from Barça in the Champions League has a price of €550.

- Basketball news:
    -   Initial price: €250
    -   Euroleague: €75
    -   Barça or Madrid: €75

- Tennis news:
    -   Initial price: €150
    -   Federer, Nadal, or Djokovic: €100

- F1 news:
    -   Initial price: €100
    -   Ferrari or Mercedes: €50

- Motorcycle news:
    -   Initial price: €100
    -   Honda or Yamaha: €50

To calculate the scores of the news items, the following criteria are followed:

- Football news:
    -   5 Points.
    -   Champions League: 3 points
    -   League: 2 points
    -   Barça or Madrid: 1 point
    -   Ferran Torres or Benzema: 1 point

> Example: A news item about a goal scored by Ferran Torres from Barça in the Champions League has a score of 10 points.

- Basketball news:
    -   4 points
    -   Euroleague: 3 points
    -   ACB: 2 points
    -   Barça or Madrid: 1 point

- Tennis news:
    -   4 points
    -   Federer, Nadal, or Djokovic: 3 points

- F1 news:
    -   4 points
    -   Ferrari or Mercedes: 2 points

- Motorcycle news:
    -   3 points
    -   Honda or Yamaha: 3 points

In the main class, a menu must be created with the following options:

1.  Introduce an editor.
2.  Remove an editor.
3.  Add news to an editor.
4.  Remove news (must request editor and news headline).
5.  Show all news by editor.
6.  Calculate news score.
7.  Calculate news price.

## 📋 Requirements

Developed with:
- *IDE* : IntelliJ IDEA 2025.2.4 (Community Edition)
- *Java version* : openjdk 21.0.8 2025-07-15

## 🛠️ Installation

Fork or download this repo.

## ▶️ Execution

Run with *IntelliJ IDEA 2025.2.4* or import to your favorite IDE.

This code has been only tested under *Java version* : openjdk 21.0.8 2025-07-15




