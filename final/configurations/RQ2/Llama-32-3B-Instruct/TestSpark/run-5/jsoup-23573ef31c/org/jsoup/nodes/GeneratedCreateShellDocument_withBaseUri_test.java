package org.jsoup.nodes;

public class GeneratedCreateShellDocument_withBaseUri_test {

    @Test
    public void createShellDocument_withBaseUri_test() {
        Document document = Document.createShell("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}