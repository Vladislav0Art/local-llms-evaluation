package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValuesNot {

    @Test
    public void testGetElementsByAttributeValuesNot() {
        // Create an element with attribute "*"
        Element element = new Element();

        // Set the value of the attribute to "newValue"
        element.setAttribute("value", "newValue");

        // Get all elements with attribute "*set" set to "newValue"
        String[] classNames = element.getClassNames();
        System.out.println(classNames); // Output: [test]

        // Assert that no elements match the expected array
        assert Arrays.asList(element.getElementsByAttributeValueValuesNot("*set", "newValue")).isEmpty();
    }

}