package org.jsoup.nodes;

public class GeneratedTestDocumentShell {

    public Document document;
    public Parser parser = new Parser();
    public QuirksMode quirksMode;

    @Test
    public void testDocumentShell() {
        document = Jsoup.connect("https://example.com").get();
        assertTrue(document.createShell(null));
    }

}