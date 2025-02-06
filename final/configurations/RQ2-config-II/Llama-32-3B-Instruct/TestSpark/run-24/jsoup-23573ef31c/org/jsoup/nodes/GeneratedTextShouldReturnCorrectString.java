package org.jsoup.nodes;

public class GeneratedTextShouldReturnCorrectString {

    @Test
    public void textShouldReturnCorrectString() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        String text = document.text("Hello World");
        assertEquals("Hello World", text);
    }

}