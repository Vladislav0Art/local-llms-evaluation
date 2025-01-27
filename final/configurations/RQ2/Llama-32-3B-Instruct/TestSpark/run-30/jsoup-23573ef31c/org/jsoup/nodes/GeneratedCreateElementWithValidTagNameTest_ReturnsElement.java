package org.jsoup.nodes;

public class GeneratedCreateElementWithValidTagNameTest_ReturnsElement {

    @Test
    public void createElementWithValidTagNameTest_ReturnsElement() {
        String tagName = "div";
        Element element = Document.createElement(tagName);
        assertNotNull(element);
    }

}