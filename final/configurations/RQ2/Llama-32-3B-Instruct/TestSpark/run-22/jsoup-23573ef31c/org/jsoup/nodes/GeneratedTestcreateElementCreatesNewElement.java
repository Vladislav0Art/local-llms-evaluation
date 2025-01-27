package org.jsoup.nodes;

public class GeneratedTestcreateElementCreatesNewElement {

    @Test
    public void testcreateElementCreatesNewElement() {
        String tagName = "div";
        Element element = document.createElement(tagName);
        assertNotNull(element);
        assertTrue(element instanceof Element);
    }

}