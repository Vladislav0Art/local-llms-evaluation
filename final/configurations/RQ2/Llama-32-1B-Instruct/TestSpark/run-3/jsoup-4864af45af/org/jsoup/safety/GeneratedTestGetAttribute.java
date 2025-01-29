package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestGetAttribute {

    @Test
    public void testGetAttribute() {
        String element = "a";
        String attribute = "class";

        // Test case 1: get attribute of an attributeless element
        boolean isSafe = Element.isSafeAttribute(element, attribute);
        System.out.println("isSafe: " + isSafe);

        // Test case 2: get attribute of a non-existent attribute
        isSafe = Element.isSafeAttribute(element, "b");
        System.out.println("isSafe: " + isSafe);
    }

}