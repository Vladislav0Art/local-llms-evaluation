package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetElementsByAttributeOf {

    @Test
    public void testGetElementsByAttributeOf() {
        // Test for the get elements by attribute of method in a class that implements the Node interface
        String[] names = {"TestClass1", "TestClass2"};
        Node testClass1 = new TestClass1(names[0]);
        System.out.println("testGetElementsByAttributeOf: " + (testClass1.getElementsByAttributeOf("attr1") != null ? "" : "no"));
    }

}