package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValueContaining {

    @Test
    public void testGetElementsByAttributeValueContaining() {
        // Create an element with attributes containing "value"
        Element element = new Element();
        element.addClass("test").setAttribute("value", "newValue");

        // Get all elements with the attribute "value" matching "*value"
        String[] classNames = element.getClassNames();
        System.out.println(classNames); // Output: [test]

        // Assert that no elements match the expected array
        assert Arrays.asList(element.getElementsByAttributeValueContaining("*value", "newValue")).isEmpty();
    }

}