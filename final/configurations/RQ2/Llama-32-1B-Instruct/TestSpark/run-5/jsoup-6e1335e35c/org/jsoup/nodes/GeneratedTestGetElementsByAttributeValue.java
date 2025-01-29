package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValue {

    @Test
    public void testGetElementsByAttributeValue() {
        // Create an element with attributes "class" and "value"
        Element element = new Element();
        element.addClass("test").setAttribute("value", "newValue");

        // Get all elements with the attribute "value" set to "newValue"
        String[] classNames = element.getClassNames();
        System.out.println(classNames); // Output: [test]

        // Assert that all elements match the expected array
        assert Arrays.asList(element.getElementsByAttributeValue("value", "newValue")).contains("test");
    }

}