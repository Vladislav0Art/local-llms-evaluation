package org.jsoup.nodes;

public class GeneratedTestConnection {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testConnection() {
        Connection conn = document.connection();
        assertNotNull(conn);
    }

}