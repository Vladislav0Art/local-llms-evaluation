package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttribute {

    @Test
    public void testGetElementsByAttribute() {
        // Create an element with an attribute "class"
        Element element = new Element();

        // Set the class attribute of the element to "test"
        element.addClass("test");

        // Get all elements with the "class" attribute set to "test"
        String[] classNames = element.getClassNames();
        System.out.println(classNames); // Output: [test]

        // Assert that all elements match the expected array
        assert Arrays.asList(element.getElementsByClass("test")).contains("test");
    }

}