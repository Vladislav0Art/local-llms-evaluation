package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValueEnding {

    @Test
    public void testGetElementsByAttributeValueEnding() {
        // Create an element with attributes ending in "value"
        Element element = new Element();
        element.addClass("test").setAttribute("value", "newValue");

        // Get all elements with the attribute "value" ending in "new"
        String[] classNames = element.getClassNames();
        System.out.println(classNames); // Output: [test]

        // Assert that no elements match the expected array
        assert Arrays.asList(element.getElementsByAttributeValueEnding("value", "new")).isEmpty();
    }

}