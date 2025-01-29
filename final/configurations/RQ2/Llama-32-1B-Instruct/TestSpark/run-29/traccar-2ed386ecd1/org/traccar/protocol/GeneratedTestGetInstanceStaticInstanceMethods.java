package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestGetInstanceStaticInstanceMethods {

    @Test
    public void testGetInstanceStaticInstanceMethods() {
        // Test public method on a generated class
        String[] names = {"Math", "String"};
        for (String name : names) {
            System.out.println("Testing getinstancestatic instance methods on " + name);
            Method[] methods = Main.getPublicMethods(name);
            if (methods.length > 0 && !name.equals("Math")) {
                for (Method method : methods) {
                    try {
                        System.out.println(method.getName() + " method found in " + methods[0].getDeclaringClass());
                        main.getInstanceStaticInstance();
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to call method: " + method.getName(), e);
                    }
                }
            }
        }
    }

    private String getPublicClass(String className, Class<?> classType) {
        try {
            return classType.getDeclaredConstructor(String.class).newInstance(className);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of class " + className + ", error: " + e.getMessage(), e);
        }
    }

    private Method[] getPublicMethods(String className) {
        try {
            Class<?> clazz = Main.getPublicClass(className, Object.class);
            return clazz.getDeclaredMethods();
        } catch (Exception e) {
            throw new RuntimeException("Failed to find methods of class " + className + ", error: " + e.getMessage(), e);
        }
    }

    private void publicMethod() {
        Method[] methods = getPublicMethods("Math");
        for (Method method : methods) {
            try {
                System.out.println(method.getName() + " method found in " + methods[0].getDeclaringClass());
                main.publicMethod();
            } catch (Exception e) {
                throw new RuntimeException("Failed to call method: " + method.getName(), e);
            }
        }
    }

    private void staticMethod() {
        Method[] methods = getPublicMethods("Math");
        for (Method method : methods) {
            try {
                System.out.println(method.getName() + " method found in " + methods[0].getDeclaringClass());
                main.staticMethod();
            } catch (Exception e) {
                throw new RuntimeException("Failed to call method: " + method.getName(), e);
            }
        }
    }

    private void getInstance() {
        Method[] methods = getPublicMethods("Math");
        for (Method method : methods) {
            try {
                System.out.println(method.getName() + " method found in " + methods[0].getDeclaringClass());
                main.getInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to call method: " + method.getName(), e);
            }
        }
    }

    private void getInstanceStatic() {
        Method[] methods = getPublicMethods("Math");
        for (Method method : methods) {
            try {
                System.out.println(method.getName() + " method found in " + methods[0].getDeclaringClass());
                main.getInstanceStatic();
            } catch (Exception e) {
                throw new RuntimeException("Failed to call method: " + method.getName(), e);
            }
        }
    }

    private void getInstanceStaticInstance() {
        Method[] methods = getPublicMethods("Math");
        for (Method method : methods) {
            try {
                System.out.println(method.getName() + " method found in " + methods[0].getDeclaringClass());
                main.getInstanceStaticInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to call method: " + method.getName(), e);
            }
        }
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Running test cases...");
        Main.main();
    }

}