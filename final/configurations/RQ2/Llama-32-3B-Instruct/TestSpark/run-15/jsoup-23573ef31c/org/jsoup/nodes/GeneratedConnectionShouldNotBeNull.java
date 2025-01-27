package org.jsoup.nodes;

public class GeneratedConnectionShouldNotBeNull {

    @Test
    public void connectionShouldNotBeNull() {
        Document document = Document.createShell("https://example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

}