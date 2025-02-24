package org.jsoup.nodes;

public class GeneratedCreateShellTest {

    private Document document;

    @Test
    public void createShellTest() {
        document = Document.createShell("http://www.example.com");
        assertNotNull(document);
    }

}