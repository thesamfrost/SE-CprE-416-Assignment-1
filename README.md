# SE-CprE-416-Assignment-1

OOP Design Challenge: Music Themed Project
Overview
This repository contains a Java project that demonstrates key object-oriented programming (OOP) principles using a music theme. The project showcases:

Inheritance: Using an abstract base class Instrument with concrete subclasses Guitar and Piano.
Interface Implementation: Implementing the Recordable interface in the Piano class.
Polymorphism: Demonstrated through method overriding (in both Guitar and Piano) and method overloading (in Piano).
Data Coupling: Illustrated by passing primitive data types between methods in the Instrument class.
Stamp Coupling: Shown by passing a composite object (Song) to methods in the MusicPlayer class.
Project Structure
Instrument.java
An abstract base class representing a general musical instrument. It defines common properties (like name and volume) and an abstract method play().
OOP Concepts: Inheritance, Data Coupling

Guitar.java
A subclass of Instrument that represents a guitar. It overrides the play() method to simulate strumming chords.
OOP Concepts: Inheritance, Method Overriding

Piano.java
A subclass of Instrument representing a piano. It implements the Recordable interface, providing recording functionality, and overloads the play() method to allow playing a specific song.
OOP Concepts: Inheritance, Interface Implementation, Method Overloading

Recordable.java
An interface that defines a method for recording.
OOP Concepts: Interface Implementation

Song.java
A simple data class that represents a song with attributes such as title and duration (in seconds).
OOP Concepts: Used in Stamp Coupling

MusicPlayer.java
A class that simulates a music player. It demonstrates stamp coupling by accepting a Song object as a parameter. The main() method instantiates various objects to show the interplay of inheritance, polymorphism, and coupling in the project.
OOP Concepts: Stamp Coupling, Integration of Multiple OOP Principles