package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestGetInstanceStaticMethods {

    @Test
    public void testGetInstanceStaticMethods() {
        // Test public method on a generated class
        String[] names = {"Math", "String"};
        for (String name : names) {
            System.out.println("Testing getinstancestatic methods on " + name);
            Method[] methods = Main.getPublicMethods(name);
            if (methods.length > 0 && !name.equals("Math")) {
                for (Method method : methods) {
                    try {
                        System.out.println(method.getName() + " method found in " + methods[0].getDeclaringClass());
                        main.getInstanceStatic();
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to call method: " + method.getName(), e);
                    }
                }
            }
        }
    }

}