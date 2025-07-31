package org.example.main;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;
import static java.lang.System.*;

// Import here manually
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassOne class1 = new ClassOne();
        ClassTwo class2 = new ClassTwo();
        ClassThree class3 = new ClassThree();

        out.println(class1.greet());
        out.println(class2.greet());
        out.println(class3.greet());
    }
}