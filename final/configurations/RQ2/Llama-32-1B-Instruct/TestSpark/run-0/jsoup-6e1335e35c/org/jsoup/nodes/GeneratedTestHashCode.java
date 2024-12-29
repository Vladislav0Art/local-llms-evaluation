package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        // Test for the hash code calculation in a class that implements the Node interface
        String[] names = {"TestClass1", "TestClass2"};
        Node testClass1 = new TestClass1(names[0]);
        System.out.println("testHashCode: " + (testClass1.hashCode() == 0 ? "" : "no"));
    }

}