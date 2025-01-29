package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestGetPublicMethods {

    @Test
    public void testGetPublicMethods() {
        // Test public method on a generated class
        String[] names = {"Math", "String"};
        for (String name : names) {
            System.out.println("Testing methods on " + name);
            Main.getPublicClass(name, Math.class).getDeclaredMethod(name + "_method").invoke(null);
        }
    }

}