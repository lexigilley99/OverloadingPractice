package org.example;

public class Animal {
    private final String name;
    private final boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name) {
        this(name, false); // default to isDog = false
    }

    public Animal(boolean isDog) {
        this("Unknown", isDog); // default name to "Unknown"
    }

    public Animal() {
        this("Unknown", false); // default name to "Unknown" and isDog to false
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for isDog
    public boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}

