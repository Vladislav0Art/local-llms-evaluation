package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetElementById {

    @Test
    public void testGetElementById() {
        // Test for the get element by id method in a class that implements the Node interface
        String[] names = {"TestClass1", "TestClass2"};
        Node testClass1 = new TestClass1(names[0]);
        System.out.println("testGetElementById: " + (testClass1.getElementById("id1") != null ? "" : "no"));
    }

}