package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValueNot {

    @Test
    public void testGetElementsByAttributeValueNot() {
        // Create an element with attributes "class" and "value"
        Element element = new Element();
        element.addClass("test").setAttribute("value", "newValue");

        // Get all elements with the attribute "value" not set to "newValue"
        String[] classNames = element.getClassNames();
        System.out.println(classNames); // Output: [test]

        // Assert that no elements match the expected array
        assert Arrays.asList(element.getElementsByAttributeValueNot("value", "newValue")).isEmpty();
    }

}