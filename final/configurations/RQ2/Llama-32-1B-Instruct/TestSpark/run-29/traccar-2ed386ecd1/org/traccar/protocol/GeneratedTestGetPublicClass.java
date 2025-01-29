package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestGetPublicClass {

    @Test
    public void testGetPublicClass() {
        // Test public method on a generated class
        String[] names = {"Math", "String"};
        for (String name : names) {
            System.out.println("Testing public methods on " + name);
            String publicClassName = Main.getPublicClass(name, Math.class);
            Method[] methods = Main.getPublicMethods(name);
            if (methods.length > 0 && !name.equals("Math")) {
                for (Method method : methods) {
                    try {
                        System.out.println(method.getName() + " method found in " + publicClassName);
                        Main.getPublicClass(publicClassName, Math.class).getDeclaredMethod(method.getName()).invoke(null);
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to call method: " + method.getName(), e);
                    }
                }
            }
        }
    }

}