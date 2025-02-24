package org.jsoup.nodes;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.baseUri());
    }

}