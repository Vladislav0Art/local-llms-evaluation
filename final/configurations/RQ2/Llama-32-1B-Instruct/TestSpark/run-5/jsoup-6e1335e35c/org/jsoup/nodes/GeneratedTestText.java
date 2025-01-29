package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestText {

    @Test
    public void testText() {
        // Create an element
        Element element = new Element();

        // Set the text content of the element
        element.setText("Hello, World!");

        // Assert that the text content is correct
        assert element.getText().equals("Hello, World!");
    }

}