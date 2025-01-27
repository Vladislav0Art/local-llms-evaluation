package org.jsoup.nodes;

public class GeneratedCreateShell_test {

    @Test
    public void createShell_test() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

}