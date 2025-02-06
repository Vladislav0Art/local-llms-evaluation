package org.jsoup.nodes;

public class GeneratedTitleSetterShouldSetCorrectTitle {

    @Test
    public void titleSetterShouldSetCorrectTitle() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

}