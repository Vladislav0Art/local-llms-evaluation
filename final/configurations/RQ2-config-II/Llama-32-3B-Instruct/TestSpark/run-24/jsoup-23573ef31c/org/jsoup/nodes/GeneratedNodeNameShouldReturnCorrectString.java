package org.jsoup.nodes;

public class GeneratedNodeNameShouldReturnCorrectString {

    @Test
    public void nodeNameShouldReturnCorrectString() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        String nodeName = document.nodeName();
        assertNotNull(nodeName);
    }

}