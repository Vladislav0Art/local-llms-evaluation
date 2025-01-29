package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByClass {

    @Test
    public void testGetElementsByClass() {
        // Create elements with different class names
        Element element1 = new Element();
        Element element2 = new Element("class='test'");
        Element element3 = new Element();

        // Get all elements with the "test" class
        String[] classNames = element1.getClassNames().toArray(new String[0]);
        System.out.println(classNames); // Output: [test]

        // Assert that all elements match the expected array
        assert Arrays.asList(element2, element3).contains("test");
    }

}