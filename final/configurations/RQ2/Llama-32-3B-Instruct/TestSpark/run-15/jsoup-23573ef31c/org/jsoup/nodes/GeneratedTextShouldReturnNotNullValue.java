package org.jsoup.nodes;

public class GeneratedTextShouldReturnNotNullValue {

    @Test
    public void textShouldReturnNotNullValue() {
        Document document = Document.createShell("https://example.com");
        Element element = document.createElement("div");
        String text = document.text(element);
        assertNotNull(text);
    }

}