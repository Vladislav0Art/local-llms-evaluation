package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValueMatching {

    @Test
    public void testGetElementsByAttributeValueMatching() {
        // Create an element with attributes matching "*"
        Element element = new Element();
        element.addClass("test").setAttribute("class", "*");

        // Get all elements with the attribute "*class" set to "*"
        String[] classNames = element.getClassNames();
        System.out.println(classNames); // Output: [test]

        // Assert that no elements match the expected array
        assert Arrays.asList(element.getElementsByAttributeValueMatching("*", "newValue")).isEmpty();
    }

}