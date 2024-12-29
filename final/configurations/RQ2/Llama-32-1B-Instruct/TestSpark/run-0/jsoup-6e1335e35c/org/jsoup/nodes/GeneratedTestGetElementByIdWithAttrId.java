package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetElementByIdWithAttrId {

    @Test
    public void testGetElementByIdWithAttrId() {
        // Test for the get element by id with attribute id method in a class that implements the Node interface
        String[] names = {"TestClass1", "TestClass2"};
        Node testClass1 = new TestClass1(names[0]);
        System.out.println("testGetElementByIdWithAttrId: " + (testClass1.getElementById("id1") != null ? "" : "no"));
    }

}