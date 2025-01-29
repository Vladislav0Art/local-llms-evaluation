package org.jsoup.nodes;

public class GeneratedTestConnection {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testConnection() {
        Connection connection = document.connection();
        assertEquals("http://example.com", connection.getUri());
    }

}