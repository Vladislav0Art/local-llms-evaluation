package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextAttribute {

    @Test
    public void testTextAttribute() {
        Element element = new Element();
        element.setText("Hello World");
        assertEquals("Hello World", element.getText());
    }

}