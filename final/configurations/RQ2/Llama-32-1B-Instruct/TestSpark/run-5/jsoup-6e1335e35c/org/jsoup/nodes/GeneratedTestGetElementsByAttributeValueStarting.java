package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValueStarting {

    @Test
    public void testGetElementsByAttributeValueStarting() {
        // Create an element with attributes starting with "class"
        Element element = new Element();
        element.addClass("test").setAttribute("class", "newClass");

        // Get all elements with the attribute "class" starting with "new"
        String[] classNames = element.getClassNames();
        System.out.println(classNames); // Output: [newClass]

        // Assert that all elements match the expected array
        assert Arrays.asList(element.getElementsByAttributeValueStarting("class", "new")).contains("newClass");
    }

}