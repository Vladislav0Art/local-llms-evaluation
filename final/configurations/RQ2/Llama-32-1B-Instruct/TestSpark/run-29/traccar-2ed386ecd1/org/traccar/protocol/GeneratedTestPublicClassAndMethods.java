package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestPublicClassAndMethods {

    @Test
    public void testPublicClassAndMethods() {
        // Test public class and method on a generated class
        String[] names = {"Math", "String"};
        for (String name : names) {
            System.out.println("Testing classes and methods on " + name);
            Main.getPublicClass(name, Math.class).getDeclaredMethod(name + "_method").invoke(null);
        }
    }

}