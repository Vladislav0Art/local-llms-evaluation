package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestGetDescendant {

    @Test
    public void testGetDescendant() {
        String element = "div";

        // Test case 1: get descendants of an element with no children
        DescendantElement descendant = Element.getDescendants(element);
        if (descendant != null) {
            System.out.println("Descendants: " + descendant.getName());
        } else {
            System.out.println("No descendants");
        }

        // Test case 2: get descendants of an element with children
        descendent = Element.getDescendants(null, true);
        if (descendant == null) {
            System.out.println("No descendants");
        } else {
            System.out.println("Descendants: " + descendant.getName());
        }
    }

}