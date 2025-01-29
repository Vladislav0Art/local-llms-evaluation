package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestGetSib {

    @Test
    public void testGetSib() {
        String element = "span";

        // Test case 1: get sibling elements of an element with no parent
        SiblingElement sibling = Element.getSibs(element);
        if (sibling != null) {
            System.out.println("Sibling: " + sibling.getName());
        } else {
            System.out.println("No siblings");
        }

        // Test case 2: get sibling elements of an element without a parent
        sibling = Element.getSibs(null, true);
        if (sibling == null) {
            System.out.println("No siblings");
        } else {
            System.out.println("Sibling: " + sibling.getName());
        }
    }

}