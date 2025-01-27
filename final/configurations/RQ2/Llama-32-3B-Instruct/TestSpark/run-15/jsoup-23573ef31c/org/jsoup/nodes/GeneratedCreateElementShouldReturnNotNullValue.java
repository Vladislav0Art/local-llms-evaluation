package org.jsoup.nodes;

public class GeneratedCreateElementShouldReturnNotNullValue {

    @Test
    public void createElementShouldReturnNotNullValue() {
        Document document = Document.createShell("https://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

}