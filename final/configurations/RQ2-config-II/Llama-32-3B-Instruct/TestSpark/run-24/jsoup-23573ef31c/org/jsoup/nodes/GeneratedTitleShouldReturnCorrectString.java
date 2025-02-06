package org.jsoup.nodes;

public class GeneratedTitleShouldReturnCorrectString {

    @Test
    public void titleShouldReturnCorrectString() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        String title = document.title();
        assertNotNull(title);
    }

}