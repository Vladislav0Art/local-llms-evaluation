package org.jsoup.nodes;

public class GeneratedCreateShellDocumentTest {

    @Test
    public void createShellDocumentTest() {
        Connection connection = new Connection();
        Document document = Document.createShell("https://www.example.com");
        assertEquals("https://www.example.com", document.location());
    }

}