package org.jsoup.nodes;

public class GeneratedTitleShouldNotBeNull {

    @Test
    public void titleShouldNotBeNull() {
        Document document = Document.createShell("https://example.com");
        String title = document.title();
        assertNotNull(title);
    }

}