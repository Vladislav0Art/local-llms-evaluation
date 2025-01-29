package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestGeneratePublicMethods {

    @Test
    public void testGeneratePublicMethods() {
        Main.generatePublicMethods();
    }

    public static void createPublicClass() {
        String className = "MyPublicClass";
        try {
            Class<?> clazz = Class.forName("org.stellar.sdk.PublicClass");
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
        }
    }

    public static void generatePublicMethods() {
        String className = "MyPublicMethod";
        try {
            Class<?> clazz = Class.forName("org.stellar.sdk.PublicMethod");
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
        }
    }

}