package org.jsoup.nodes;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document.head());
    }

}