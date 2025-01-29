package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestHasClassName {

    @Test
    public void testHasClassName() {
        // Create an element with a class name
        Element element = new Element("class='test'");

        // Assert that the element has the class name
        assert element.getClassName().equals("test");
    }

}