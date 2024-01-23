package com.solid.solid.DIP;
/*

--> The principle of dependency inversion refers to the decoupling of software modules.
This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.

Now our classes are decoupled and communicate through the Keyboard abstraction. If we want,
we can easily switch out the type of keyboard in our machine with a different implementation of the interface.
 */
public class Windows98Machine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
