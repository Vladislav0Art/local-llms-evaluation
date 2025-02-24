package org.jsoup.nodes;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals("#document", document.nodeName());
    }

}