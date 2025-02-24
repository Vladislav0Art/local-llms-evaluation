package org.jsoup.nodes;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        String title = "Title";
        document.title(title);
        assertEquals(title, document.title());
    }

}