package org.jsoup.nodes;

public class GeneratedCreateShellDocument_shellCreationTest {

    @Test
    public void createShellDocument_shellCreationTest() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

}