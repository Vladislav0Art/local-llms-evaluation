package org.stellar.sdk;

import org.junit.Test;

import java.util.Arrays;

public class GeneratedTestEdDSAPublicKey {

    public static void main(String[] args) {
        new Test().run();
    }

    @Test
    public void testEdDSAPublicKey() {
        Class<?> clazz = getClass();
        String className = clazz.getSimpleName();

        if (className.contains("Public") && !className.contains("Key")) {
            throw new RuntimeException("Error: " + className);
        }
    }

}