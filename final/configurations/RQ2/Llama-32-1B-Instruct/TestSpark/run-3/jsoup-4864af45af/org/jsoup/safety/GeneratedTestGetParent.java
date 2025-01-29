package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestGetParent {

    @Test
    public void testGetParent() {
        String element = "span";

        // Test case 1: get parent element of an element with no parent
        ParentElement parent = Element.getParent(element);
        if (parent != null) {
            System.out.println("Parent: " + parent.getName());
        } else {
            System.out.println("No parent");
        }

        // Test case 2: get parent element of an element without a parent
        parent = Element.getParent(null);
        if (parent == null) {
            System.out.println("No parent");
        } else {
            System.out.println("Parent: " + parent.getName());
        }
    }

}