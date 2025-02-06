package org.jsoup.nodes;

public class GeneratedCreateElementShouldReturnCorrectElement {

    @Test
    public void createElementShouldReturnCorrectElement() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Element createdElement = document.createElement("div");
        assertNotNull(createdElement);
        assertEquals("div", createdElement.nodeName());
    }

}